package com.example.praticaintegradora2;

import com.example.praticaintegradora2.controller.Morse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

@SpringBootApplication
public class PraticaIntegradora2Application {

    public static void main(String[] args) {
        SpringApplication.run(PraticaIntegradora2Application.class, args);
        PraticaIntegradora2Application programa = new PraticaIntegradora2Application();

    }
}
