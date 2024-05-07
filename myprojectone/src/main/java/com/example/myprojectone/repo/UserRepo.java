package com.example.myprojectone.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myprojectone.model.User;
import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    public User findById(int id);
    public Optional<User> deleteByUser(int id);
    public Object stream();
}
