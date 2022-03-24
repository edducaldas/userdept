package com.devsuperior.userdept.controllers;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.persistence.*;


import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        return repository.findAll();
    }

    @GetMapping(value="/{id}")
    public User findById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public User Insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }

}
