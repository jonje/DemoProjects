package edu.neumont.jjensen.observerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjensen on 11/4/14.
 */
public class Person {
    private List<Person> subscribers = new ArrayList<Person>();
    private String name;
    private String status;

    public Person(String name) {
        this.name = name;
    }

    public void subscribe(Person person) {
        subscribers.add(person);
    }

    public void setStatus(String status) {
        this.status = status;
        notifySubscribers();
    }

    public void inform() {
        System.out.println(this + " was notified of status update");
    }

    private void notifySubscribers() {
        for(Person person : subscribers) {
            person.inform();
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
