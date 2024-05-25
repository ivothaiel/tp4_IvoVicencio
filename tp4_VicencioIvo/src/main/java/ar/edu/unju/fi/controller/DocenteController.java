package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Docente;

@Controller
public class DocenteController {

    @Autowired
    private List<Docente> docentes;

    @GetMapping("/docentes")
    public String getDocentesPage(Model model) {
        if (docentes.isEmpty()) {
            Docente docente1 = new Docente("001", "Ariel", "Vega", "ArielVega@gmail.com", "38854675");
            Docente docente2 = new Docente("002", "Veronica", "Torres", "VeronicaTorres@gmail.com", "3885467345");
            docentes.add(docente1);
            docentes.add(docente2);
        }
        model.addAttribute("docentes", docentes);
        return "docentes";
    }
}
