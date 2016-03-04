package org.barberini.dev.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
    @RequestMapping(value={"/"})
    public String homePage(Model model) {
        String prova = "Benvenuto su questo sito web!";
        model.addAttribute("prova", (Object)prova);
        return "welcome";
    }
}
