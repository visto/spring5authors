package de.spring5webapp.spring5authors.controller;

import de.spring5webapp.spring5authors.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    private AuthorRepository authorRepository;


    @RequestMapping
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
