package com.universidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.universidad.repository.EstudianteRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UniversidadApplication {
    @Autowired
    private EstudianteRepository estudianteRepository;
    public static void main(String[] args) {
        SpringApplication.run(UniversidadApplication.class, args);
    }
    @PostConstruct  // Se ejecuta después de que Spring Boot esté listo
    public void init() {
        estudianteRepository.init();  // Carga los datos de prueba
        System.out.println("=== Datos de prueba cargados ===");
    }
}