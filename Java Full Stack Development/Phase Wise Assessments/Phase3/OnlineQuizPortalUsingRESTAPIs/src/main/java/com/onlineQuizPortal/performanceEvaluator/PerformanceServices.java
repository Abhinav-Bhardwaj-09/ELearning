package com.onlineQuizPortal.performanceEvaluator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 03/09/22
 * Time: 11:59
 */

@Service
public class PerformanceServices {
    @Autowired
    PerformanceJPARepo performanceJPARepo;

    public UserPerformance addPerformance(UserPerformance userPerformance) {
        return performanceJPARepo.save(userPerformance);
    }

    public List<UserPerformance> fetchStats(int userId) {
        return performanceJPARepo.findAllByUserId(userId);
    }
}
