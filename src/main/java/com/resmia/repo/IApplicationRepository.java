/**
 * Created by wangdi on 7/10/17.
 */

package com.resmia.repo;

import com.resmia.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface IApplicationRepository extends JpaRepository<Application, Long> {
    ArrayList<Application> findApplicationsByJobId(Long id);
}
