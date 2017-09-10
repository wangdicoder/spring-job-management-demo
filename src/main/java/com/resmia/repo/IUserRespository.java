package com.resmia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resmia.domain.User;

public interface IUserRespository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
