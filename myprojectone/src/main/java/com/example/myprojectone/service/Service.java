package com.example.myprojectone.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.myprojectone.model.User;
import com.example.myprojectone.repo.UserRepo;

@Component
public class Service {
    @Autowired
    private UserRepo UserRepo;

    public List<User> findDetail() {
        return UserRepo.findAll();

    }

    public User saveData(User user) {
        User detail = UserRepo.save(user);
        return detail;
    }

    public User fetchDetail(int id) {
        System.out.println(id + "snjdchbdchsdchsdjcbsjhdcbjs");
        return UserRepo.findById(id);
    }

    public User updateDetail(int id, User user) {
        user.setId(id);
        User method = UserRepo.save(user);
        return method;
    }

    
    // public void deleteData(int id) {
    //     UserRepo = UserRepo.stream()
    //                        .filter(User -> User.getId() != id)
    //                        .collect(Collectors.toList());
    // }

    public void deleteData(int id) {
        UserRepo.deleteById(id);
    }


}
