package com.example.webcompany;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConnexionController {

    @GetMapping("/connexion")
    public String connexionForm(Model model) {
        model.addAttribute("connexion", new Connexion());
        return "connexion";
    }

    @PostMapping("/connexion")
    public String connexionSubmit(@ModelAttribute Connexion connexion, Model model) {
        model.addAttribute("connexion", connexion);
        return "result";
    }

}