package com.onlineQuizPortal.performanceEvaluator;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA
 * User: Abhinav Bhardwaj
 * Date: 03/09/22
 * Time: 14:20
 */


public class CompositeKey implements Serializable {     // to make a composite primary key
    private int userId;
    private int quizId;
}
