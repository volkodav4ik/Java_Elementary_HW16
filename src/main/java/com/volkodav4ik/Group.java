package com.volkodav4ik;

import java.util.List;

public class Group {
    private String name;
    private List<Person> persons;

    public Group(String name, List<Person> persons) {
        this.name = name;
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "{\"name\":" + name +
                ",\"persons\":" + persons +
                "}";
    }
}
