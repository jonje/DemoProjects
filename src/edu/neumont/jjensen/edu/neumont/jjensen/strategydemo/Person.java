package edu.neumont.jjensen.edu.neumont.jjensen.strategydemo;

/**
 * Created by jjensen on 11/4/14.
 */
public class Person {
    private String name;
    private PersonBehavior behavior;

    public Person(String name, PersonBehavior behavior) {
        this.name = name;
        this.behavior = behavior;

    }

    public void doDayTimeActivity() {
        behavior.doDayTimeActivity();
    }

    public void doNightTimeActivity() {
        behavior.doNightTimeActivity();
    }

    public void bites(Person p) {
        if(behavior instanceof VampireBehavior) {
            p.behavior = this.behavior;
        }
    }


    @Override
    public String toString() {
        return name;
    }

}
