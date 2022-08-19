package com.example.library.service;

import com.example.library.model.Author;
import com.example.library.repsitory.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

   private AuthorRepository authorRepository;



   public List<Author> all (){
        return authorRepository.findAll();
   }
   public Author getById(Long id){
       return authorRepository.getById(id);
   }

   public Author save (Author author){
       return authorRepository.save(author);
   }


}
