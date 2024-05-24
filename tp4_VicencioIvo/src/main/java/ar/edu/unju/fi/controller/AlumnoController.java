package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Alumno;

@Controller
public class AlumnoController {


    private List<Alumno> alumnos = new ArrayList<>();


    public AlumnoController() {

        Alumno alumno1 = new Alumno("12345678", "Juan", "Perez", "juanperez@example.com", "123456789", null, "Calle 123", "1234");
        Alumno alumno2 = new Alumno("23456789", "María", "González", "mariagonzalez@example.com", "987654321", null, "Avenida 456", "5678");
        alumnos.add(alumno1);
        alumnos.add(alumno2);
    }

    
    @GetMapping("/alumnos")
    public String getAlumnosPage(Model model) {
        
        model.addAttribute("alumnos", alumnos);
       
        return "alumnos";
    }
}
