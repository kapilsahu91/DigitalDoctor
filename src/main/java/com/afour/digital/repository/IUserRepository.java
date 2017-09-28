package com.afour.digital.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afour.digital.model.*;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    
	User findByUserId(int id);
	User findByUserName(String userName);
	
}