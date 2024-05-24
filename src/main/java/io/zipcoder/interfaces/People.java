package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class People implements Iterable
{
    ArrayList<Person> daPeople = new ArrayList<Person>();
    public void addPerson(Person person)
    {
        this.daPeople.add(person);
    }
    public void removePerson(Person person)
    {
        daPeople.remove(person);
    }
    public Person findByID(long id)
    {
        for(Person daPerson:daPeople)
        {
            if (daPerson.getID()==id)
                return daPerson;
        }
        return null;
    }
    public boolean contains(Person daGuy)
    {
        return daPeople.contains(daGuy);
    }
    public void removeAll()
    {
        daPeople.clear();
    }
    public void removeByID(long id)
    {
        daPeople.removeIf(daPerson -> daPerson.getID() == id);
    }
    public int count()
    {
        return daPeople.size();
    }
    public Person[] toPersonArray()
    {
        Person[] people = daPeople.toArray(new Person[daPeople.size()]);
        return people;
    }

    @Override
    public Iterator iterator()
    {
        return daPeople.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
