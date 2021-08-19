package com.neki.mySkills.repositories;

import com.neki.mySkills.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
