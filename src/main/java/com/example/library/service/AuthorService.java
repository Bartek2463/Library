package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.repsitory.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private AuthorRepository authorRepository;


    public List<Author> all(){
         return  authorRepository.findAll();
    }

}
