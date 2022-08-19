package com.example.library.controller;

import com.example.library.model.Author;
import com.example.library.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/author")
public class AutorController {

    private AuthorService authorService;


    @GetMapping("/all")
    public List<Author> getAll(){
        return authorService.all();
    }

}
