package edu.neumont.jjensen.edu.neumont.jjensen.strategydemo;

public class Main {

    public static void main(String[] args) {
	    Person fred = new Person("Fred", new HumanBehavior());
        Person barney = new Person("Barney", new VampireBehavior());

        System.out.println("It's daytime!");

        System.out.println(fred);
        fred.doDayTimeActivity();

        System.out.println(barney);
        barney.doDayTimeActivity();

        System.out.println("It's night time now...");
        System.out.println(fred);
        fred.doDayTimeActivity();

        System.out.println(barney);
        barney.doDayTimeActivity();

        barney.bites(fred);
        System.out.println("It's daytime!");

        System.out.println(fred);
        fred.doDayTimeActivity();

        System.out.println(barney);
        barney.doDayTimeActivity();

        System.out.println("It's night time now...");
        System.out.println(fred);
        fred.doDayTimeActivity();

        System.out.println(barney);
        barney.doDayTimeActivity();
    }
}
