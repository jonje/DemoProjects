package edu.neumont.jjensen.observerdemo;

/**
 * Created by jjensen on 11/4/14.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Person fred = new Person("Fred");
        fred.subscribe(new Person("Alice"));
        fred.subscribe(new Person("Wilma"));
        fred.subscribe(new Person("Barney"));

        fred.setStatus("I am coming home");
    }
}
