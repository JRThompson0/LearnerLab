package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.*;

public class PersonTest extends TestCase
{
    Person daGuy = new Person("Jhonny Jonson");
    Person daGuy2 = new Person("Jhonny Janson");
    Person daGuy3 = new Person("Jhanny jonsse on");
    @Test
    public void testGetID()
    {
        long actual = daGuy2.getID();
        assertEquals(1,actual);
        actual = daGuy3.getID();
        assertEquals(2,actual);
    }
    @Test
    public void testSetName()
    {
        assertEquals(daGuy.getName(),"Jhonny Jonson");
        String name ="Urine Man";
        daGuy.setName(name);
        assertEquals(daGuy.getName(),name);
    }
}