package com.resmia.domain;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobRepository extends JpaRepository<Job, Long>{
	ArrayList<Job> findByStatusEquals(int status);
}
