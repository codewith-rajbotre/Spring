package com.example.SpringSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class securityConfig {

    @Autowired
    private UserDetailsService userDetailsService;

     @Bean
     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         return http
                   .csrf(customizer ->customizer.disable())
                   .authorizeHttpRequests(requests -> requests
                           .requestMatchers("register","login")
                           .permitAll()
                           .anyRequest().authenticated())
                   .httpBasic(Customizer.withDefaults())
                   .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                   .build();
         // http.formLogin(Customizer.withDefaults());
      }

//      @Bean
//      public UserDetailsService userDetailsService() {
//         UserDetails user1 = User
//                 .withDefaultPasswordEncoder()
//                 .username("Mahesh")
//                 .password("M@12345")
//                 .roles("ADMIN")
//                 .build();
//         UserDetails user2 = User
//                 .withDefaultPasswordEncoder()
//                 .username("Ajay")
//                 .password("A@12345")
//                 .roles("USER")
//                 .build();
//         return new InMemoryUserDetailsManager(user1,user2);
//      }

    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
             return  config.getAuthenticationManager();
    }

}
