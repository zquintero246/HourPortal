package com.example.HourPortal.models;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {

    @Id
    private String id;


    private String nombre;
    private String semestre;
    private String carrera;



    private String correoUnab;
    private String contraseña;
    private String idUnab;


    private int cantHoras;
}
