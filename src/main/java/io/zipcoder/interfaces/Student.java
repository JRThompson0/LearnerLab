package io.zipcoder.interfaces;

public class Student extends Person implements Learner
{
    double totalStudyTime=0;
    public Student(String name)
    {
        super(name);
    }
    @Override
    public void learn(Double numberOfHours)
    {
        totalStudyTime+=numberOfHours;
    }
    @Override
    public Double getTotalStudyTime()
    {
    return totalStudyTime;
    }
}
