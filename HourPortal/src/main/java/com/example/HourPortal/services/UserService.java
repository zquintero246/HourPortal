package com.example.HourPortal.services;

import com.example.HourPortal.models.User;
import com.example.HourPortal.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Anotacion de tipo servicio de spring
@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    //Importa el repositorio de usuarios para poder acceder a el y manejar las solicitudes
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    //Metodo que crea un nuevo usuario en la base de datos
    public void registroUser(User user) {
        log.info("Se ha registrado un usuario correctamente!");
        userRepository.save(user);
    }

    public String obtenerNombre(HttpServletRequest request) {
        return (String) request.getSession().getAttribute("nombre");
    }
}
