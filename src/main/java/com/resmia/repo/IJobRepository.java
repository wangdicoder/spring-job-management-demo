/**
 * Interaction with Database
 */
package com.resmia.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resmia.domain.Job;

public interface IJobRepository extends JpaRepository<Job, Long>{
	ArrayList<Job> findByStatusEquals(int status);
}
