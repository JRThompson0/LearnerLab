package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    Instructor daTeech = new Instructor("Boi");
    Student stud1 = new Student("Snoogat dougat");
    Student stud2 = new Student("Snfat dougat");
    Student stud3 = new Student("Snoadaasdasdgat dougat");
    Student[] students = {stud1, stud2, stud3};
    @Test
    void testInheritance()
    {
        assertInstanceOf(Person.class,daTeech);
    }
    @Test
    void testimplementation()
    {
        assertInstanceOf(Teacher.class,daTeech);
    }
    @Test
    void teach() {
        daTeech.lecture(students, 3);
        assertEquals(1, stud1.getTotalStudyTime());
        assertEquals(1, stud2.getTotalStudyTime());
        assertEquals(1, stud3.getTotalStudyTime());
        daTeech.teach(stud1, 3);
        assertEquals(4, stud1.getTotalStudyTime());
    }
}