package xyz.itbs.jokes.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.itbs.jokes.services.JokesService;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("jokes",jokesService.getJokes());
        return "jokes";
    }
}
