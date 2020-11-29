package pe.edu.tecsup.jwa.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/producto")
    String producto(Model model) {
        model.addAttribute("nombre", "iPhone 11");
        model.addAttribute("precio", "2000.00");
        model.addAttribute("cantidad", "15");
        return "producto";
    }
}
