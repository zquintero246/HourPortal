package com.example.HourPortal.controllers;


import com.example.HourPortal.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/Home")
    public String home(Model model, HttpServletRequest request){
        log.info("Se esta ejecutando el home");

        String nombreUser = userService.obtenerNombre(request);

        model.addAttribute("nombreUser", nombreUser);
        return "Home";
    }


}
