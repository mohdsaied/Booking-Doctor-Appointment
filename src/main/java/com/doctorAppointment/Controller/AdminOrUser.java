package com.doctorAppointment.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminOrUser {

    @GetMapping("/admin")
    public String getName() {
        return "AdminOrUser";
    }



}
