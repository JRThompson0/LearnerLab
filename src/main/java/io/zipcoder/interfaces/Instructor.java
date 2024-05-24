package io.zipcoder.interfaces;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher
{
    public Instructor(String name) {
        super(name);
    }
    public void teach(Learner daLearner, double hrs)
    {
        daLearner.learn(hrs);
    }

    public void lecture(Learner[] daLearners, double hrs)
    {
        double perLearner = daLearners.length;
        for(Learner daLearner:daLearners)
        {
            if (daLearner!=null)
                daLearner.learn(hrs/perLearner);
        }
    }
}
