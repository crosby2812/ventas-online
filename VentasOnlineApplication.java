package com.ventas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentasOnlineApplication {
    public static void main(String[] args) {
        System.out.println("Aplicación iniciada correctamente.");
        SpringApplication.run(VentasOnlineApplication.class, args);
    }
}
