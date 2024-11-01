package com.example.studentapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// New Controller to Serve HTML Template
@Controller
@RequestMapping("/view")
public class StudentViewController {

    @GetMapping("/students")
    public String viewStudentsPage() {
        return "students"; // Renders students.html in src/main/resources/templates
    }
}
