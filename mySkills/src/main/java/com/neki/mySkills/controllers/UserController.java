package com.neki.mySkills.controllers;

import com.neki.mySkills.entities.Skill;
import com.neki.mySkills.entities.User;
import com.neki.mySkills.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userService.findById(id), headers, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userService.findAll(), headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> save (@RequestBody User user){
        HttpHeaders headers = new HttpHeaders();
        User newUser = userService.save(user);
        if(newUser != null){
            return new ResponseEntity<>(newUser, headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(newUser, headers, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public User update(@RequestBody User user, @PathVariable Integer id){
        return userService.update(user, id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Integer id){
        userService.deleteById(id);
    }
}
