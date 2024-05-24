package io.zipcoder.interfaces;

public class Person
{
    final long id;
    static long staticID =0;
    private String name;
    public Person(String name)
    {
        this.id=staticID;
        this.name = name;
        staticID++;
    }
    public long getID()
    {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
