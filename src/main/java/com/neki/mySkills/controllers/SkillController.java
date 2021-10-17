package com.neki.mySkills.controllers;

import com.neki.mySkills.entities.Skill;
import com.neki.mySkills.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping("/{id}")
    public ResponseEntity<Skill> findById(@PathVariable Integer id){
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(skillService.findById(id), headers, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Skill>> findAll() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(skillService.findAll(), headers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Skill> save(@RequestBody Skill skill){
        HttpHeaders headers = new HttpHeaders();
        Skill newSkill = skillService.save(skill);
        if(newSkill != null) {
            return new ResponseEntity<>(newSkill, headers, HttpStatus.OK);
        }
        if(newSkill.getId() == null){
            return new ResponseEntity<>(newSkill, headers, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(newSkill, headers, HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/update/{id}")
    public Skill update(@RequestBody Skill skill, @PathVariable Integer id){
        return skillService.update(skill,id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        skillService.deleteById(id);
    }
}
