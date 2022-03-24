package com.devsuperior.userdept.repositories;

import com.devsuperior.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;
import java.util.Map;

public interface UserRepository extends JpaRepository <User, Id> {

    User findById(Long id);
}
