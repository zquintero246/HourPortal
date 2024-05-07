package com.example.HourPortal.controllers;


import com.example.HourPortal.services.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@AllArgsConstructor
public class HomeController {

    private final UserService userService;

    @GetMapping("/Home")
    public String home(Model model){
        log.info("Se esta ejecutando el home");

        return "Home";
    }


}
