package com.doctorAppointment.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminOrUser {

    @GetMapping("/admin")
    public String getName() {
        return "Only For AdminOrUser Role................";
    }

    @GetMapping("/user")
    public String getRole() {
        return "Only for User Role...............";
    }

    @GetMapping("doctor")
    public String getDoctor() {
        return "Only For Doctor Role..........";
    }
}
