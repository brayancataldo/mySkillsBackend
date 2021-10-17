package com.neki.mySkills.services;

import com.neki.mySkills.entities.Skill;
import com.neki.mySkills.entities.User;
import com.neki.mySkills.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User findById(Integer id){
        return userRepository.findById(id).get();
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User save(User user){
        User newUser = userRepository.save(user);
        return newUser;
    }
    public User update(User user, Integer id){
        user.setId(id);
        return userRepository.save(user);
    }

    public void deleteById(Integer id){
        userRepository.deleteById(id);
    }

}
