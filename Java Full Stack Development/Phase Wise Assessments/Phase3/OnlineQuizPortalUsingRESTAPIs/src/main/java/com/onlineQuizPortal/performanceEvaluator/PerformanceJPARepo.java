package com.onlineQuizPortal.performanceEvaluator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 03/09/22
 * Time: 10:14
 */

@Repository
public interface PerformanceJPARepo extends JpaRepository<UserPerformance, Integer> {
    List<UserPerformance> findAllByUserId(int userId);
}
