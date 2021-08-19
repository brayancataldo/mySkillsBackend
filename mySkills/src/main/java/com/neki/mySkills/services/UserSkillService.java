package com.neki.mySkills.services;

import com.neki.mySkills.entities.Skill;
import com.neki.mySkills.entities.UserSkill;
import com.neki.mySkills.repositories.UserSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSkillService {

    @Autowired
    public UserSkillRepository userSkillRepository;

    public UserSkill findById(Integer id){
        return userSkillRepository.findById(id).get();
    }

    public List<UserSkill> findAll(){
        return userSkillRepository.findAll();
    }

    public UserSkill save(UserSkill userSkill){
        return userSkillRepository.save(userSkill);
    }
    public UserSkill update(UserSkill userSkill, Integer id){
        userSkill.setId(id);
        return userSkillRepository.save(userSkill);
    }
    public void deleteById(Integer id){
        userSkillRepository.deleteById(id);
    }

}
