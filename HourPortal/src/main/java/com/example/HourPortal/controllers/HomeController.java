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

    @GetMapping("/Horas")
    public String horas(Model model){

        log.info("Se estan ejecutando las horas ");

        return "Horas";
    }

    @GetMapping("/Eventos")
    public String eventos(Model model){

        log.info("Se estan ejecutando eventos ");

        return "Eventos";
    }
    @GetMapping("/Ayuda")
    public String ayuda(Model model){

        log.info("Se esta ejecutando ayuda ");

        return "Ayuda";
    }
    @GetMapping("/Noticias")
    public String noticias(Model model){

        log.info("Se estan ejecutando las noticias ");

        return "Noticias";
    }



}
