package ar.edu.unju.fi.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

@Configuration
public class AppConfig {

    @Bean
    public List<Carrera> carreras() {
        return new ArrayList<>();
    }

    @Bean
    public List<Docente> docentes() {
        return new ArrayList<>();
    }

    @Bean
    public List<Materia> materias() {
        return new ArrayList<>();
    }
}
