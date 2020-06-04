package com.azad.dev.chucknorrisjokes.controllers;

import com.azad.dev.chucknorrisjokes.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping(path = "/jokes")
    public String getJokes(Model model) {

        model.addAttribute("joke", jokesService.getRandomQuotes());

        return "chucknorris";
    }
}
