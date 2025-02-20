package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    public List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Mahesh", 89),

            new Student(2, "Mandar", 90)
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        students.add(student);
        return student;

    }
}
