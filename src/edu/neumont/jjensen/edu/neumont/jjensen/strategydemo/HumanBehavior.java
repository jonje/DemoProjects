package edu.neumont.jjensen.edu.neumont.jjensen.strategydemo;

/**
 * Created by jjensen on 11/4/14.
 */
public class HumanBehavior implements PersonBehavior {
    @java.lang.Override
    public void doDayTimeActivity() {
        System.out.println("Work");
    }

    @java.lang.Override
    public void doNightTimeActivity() {
        System.out.println("Sleep");
    }

}
