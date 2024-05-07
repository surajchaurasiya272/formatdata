package com.example.myprojectone.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.myprojectone.model.User;
import com.example.myprojectone.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
public class Controller {
    @Autowired
    public Service service;

    @GetMapping("/details")
    public List<User> getUserAll() {
        return service.findDetail();
    }

    @GetMapping("/home")
    public String getData() {
        return new String("this is home");
    }

    @GetMapping("/{id}")
    public User getMethodName(@PathVariable("id") int id) {
        return service.fetchDetail(id);
    }

    @PostMapping("/save")
    public User postMethodName(@RequestBody User user) {
        User users = service.saveData(user);
        return users;
    }

    @PutMapping("/update/{id}")
    public User putMethodName(@PathVariable int id, @RequestBody User user) {
        return service.updateDetail(id, user);
    }

    // delete AlertDetail record By id

    @DeleteMapping("/delete/{id}")
    public void deletData(@PathVariable int id) {
         service.deleteData(id);
    }

}
