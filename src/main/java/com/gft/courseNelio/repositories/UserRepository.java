package com.gft.courseNelio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gft.courseNelio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
