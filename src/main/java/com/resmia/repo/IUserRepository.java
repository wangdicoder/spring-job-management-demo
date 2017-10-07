package com.resmia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resmia.domain.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
