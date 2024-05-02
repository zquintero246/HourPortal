package com.example.HourPortal.repositories;


import com.example.HourPortal.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userRepository extends MongoRepository<User, String> {

    User findByCorreoUnabAndContraseña(String correoUnab, String contraseña);
}
