package com.neki.mySkills.repositories;

import com.neki.mySkills.entities.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSkillRepository extends JpaRepository <UserSkill, Integer> {
}
