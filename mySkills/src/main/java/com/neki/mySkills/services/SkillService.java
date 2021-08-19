package com.neki.mySkills.services;

import com.neki.mySkills.entities.Skill;
import com.neki.mySkills.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    @Autowired
    public SkillRepository skillRepository;

    public Skill findById(Integer id){
        return skillRepository.findById(id).get();
    }

    public List<Skill> findAll(){
        return skillRepository.findAll();
    }

    public Skill save(Skill skill){
        Skill newSkill = skillRepository.save(skill);
        return newSkill;
    }

    public Skill update(Skill skill, Integer id){
        skill.setId(id);
        return skillRepository.save(skill);
    }

    public void deleteById(Integer id){
        skillRepository.deleteById(id);
    }

}
