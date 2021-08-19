package com.neki.mySkills.repositories;

import com.neki.mySkills.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository <Skill, Integer> {
}
