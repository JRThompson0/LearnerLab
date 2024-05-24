package io.zipcoder.interfaces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest
{
    static Student daBoi = new Student("daBois");
    @Test
    void testImplementation()
    {
        assertInstanceOf(Learner.class,daBoi);
    }
    @Test
    void testInheritance()
    {
        assertInstanceOf(Person.class,daBoi);
    }
    @Test
    void learn() {

        Person person = new Person("Person");
        double numberHours = (9.0);
        daBoi.learn(numberHours);
        Double totalStudyTime = daBoi.getTotalStudyTime();
        assertEquals(numberHours, totalStudyTime);
        assertEquals(9.0, daBoi.getTotalStudyTime());
        assertInstanceOf(person.getClass(), daBoi);
        assertInstanceOf(Learner.class, daBoi);
    }
}