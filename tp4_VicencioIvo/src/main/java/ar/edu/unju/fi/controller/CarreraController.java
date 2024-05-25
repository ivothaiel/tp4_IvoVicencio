package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Carrera;

@Controller
public class CarreraController {

    @Autowired
    private List<Carrera> carreras;

    @GetMapping("/carreras")
    public String getCarrerasPage(Model model) {
        if (carreras.isEmpty()) {
            Carrera carrera1 = new Carrera(1, "Ingeniería en Informática");
            Carrera carrera2 = new Carrera(2, "Analista Programador Universitario");
            carreras.add(carrera1);
            carreras.add(carrera2);
        }
        model.addAttribute("carreras", carreras);
        return "carreras";
    }
}
