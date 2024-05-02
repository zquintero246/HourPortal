package com.example.HourPortal.controllers;


import com.example.HourPortal.models.User;
import com.example.HourPortal.repositories.userRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class loginController {

    private final com.example.HourPortal.repositories.userRepository userRepository;

    public loginController(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String login(Model model) {
        log.info("Se esta ejecutando el login");
        return "login";
    }


    @PostMapping("/login")
    public String autenticar(@RequestParam("correoUnab") String correoUnab, @RequestParam("contraseña") String contraseña, Model model){


        User user = userRepository.findByCorreoUnabAndContraseña(correoUnab, contraseña);
        if(user != null){

        log.info("Inicio de sesion exitosa!");

        return "redirect:/home";
        }
        else {
            log.info("Credenciales invalidas");


            model.addAttribute("error", "Correo o contraseña incorrectas");


            return "login";
        }
    }

}
