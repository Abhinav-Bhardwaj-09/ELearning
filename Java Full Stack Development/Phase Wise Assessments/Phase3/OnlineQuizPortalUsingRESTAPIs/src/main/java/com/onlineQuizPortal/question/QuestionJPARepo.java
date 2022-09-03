package com.onlineQuizPortal.question;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 02/09/22
 * Time: 15:26
 */

@Repository
public interface QuestionJPARepo extends JpaRepository<QuestionObject, Integer> {
}
