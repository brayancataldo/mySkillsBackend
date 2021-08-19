package com.neki.mySkills.controllers;

import com.neki.mySkills.entities.UserSkill;
import com.neki.mySkills.services.UserSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/userskill")
public class UserSkillController {

    @Autowired
    private UserSkillService userSkillService;

    @GetMapping("/{id}")
    public ResponseEntity<UserSkill> findById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userSkillService.findById(id), headers, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<UserSkill>> findAll() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(userSkillService.findAll(), headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserSkill> save(@RequestBody UserSkill userSkill){
        HttpHeaders headers = new HttpHeaders();
        UserSkill newUserSkill = userSkillService.save(userSkill);
        if(newUserSkill != null){
            return new ResponseEntity<>(newUserSkill, headers, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(newUserSkill, headers, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("update/{id}")
    public UserSkill update(@RequestBody UserSkill userSkill, @PathVariable Integer id){
        return userSkillService.update(userSkill, id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Integer id){
        userSkillService.deleteById(id);
    }

}
