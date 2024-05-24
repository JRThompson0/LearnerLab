package io.zipcoder.interfaces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    static People people;
    @BeforeAll
    static void setUp()
    {
        people = new People();
        for (int i = 0;i< 10;i++) {
            people.addPerson(new Person("Man " + i));
        }
    }
    @Test
    void testAdd()
    {
        Person[] dapeople = people.toPersonArray();
        assert(dapeople.length==10);
        assert(dapeople[0]!=dapeople[1]);
    }

    @Test
    void testFindById()
    {
        assertEquals(people.daPeople.get(1),people.findByID(1));
    }

    @Test
    void testRemoveAndFindFail()
    {
        assertEquals(people.daPeople.get(0),people.findByID(0));
        people.removePerson(people.daPeople.get(0));
        assertNull(people.findByID(0));
    }
}