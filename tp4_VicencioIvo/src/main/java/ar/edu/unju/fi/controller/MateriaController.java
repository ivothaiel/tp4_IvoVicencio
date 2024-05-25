package ar.edu.unju.fi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.model.Carrera;
import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.model.Materia;

@Controller
public class MateriaController {

    @Autowired
    private List<Materia> materias;

    @GetMapping("/materias")
    public String getMateriasPage(Model model) {
        if (materias.isEmpty() || (materias.size() == 1 && materias.get(0).getNombre() == null)) {
            Materia unaMateria = new Materia("A1", "Programacion Visual", 2, 6, "Virtual",
                    new Docente("001", "Ariel", "Vega", "ArielVega@gmail.com", "38854675"),
                    new Carrera(1, "APU 2008"));
            Materia otraMateria = new Materia("A2", "Programacion Estructurada", 3, 6, "Virtual",
                    new Docente("002", "Veronica", "Torres", "VeronicaTorres@gmail.com", "3885467345"),
                    new Carrera(1, "APU 2008"));
            materias.add(unaMateria);
            materias.add(otraMateria);
        }
        model.addAttribute("materias", materias);
        return "materias";
    }
}
