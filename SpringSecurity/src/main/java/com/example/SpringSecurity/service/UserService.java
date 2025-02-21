package com.example.SpringSecurity.service;

import com.example.SpringSecurity.model.Users;
import com.example.SpringSecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JWTService jwtService;
    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    @Autowired
    private AuthenticationManager authenticationManager;

    public Users register(Users user){
        user.setPassword(encoder.encode(user.getPassword()));
     return  repo.save(user);
    }

    public String verify(Users user) {
        Authentication authenticate =
                 authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
                  if(authenticate.isAuthenticated()) {
                      return jwtService.generateToken();
                  }
                  return "Fail";
    }
}
