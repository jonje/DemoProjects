package edu.neumont.jjensen.edu.neumont.jjensen.strategydemo;

/**
 * Created by jjensen on 11/4/14.
 */
public class VampireBehavior implements PersonBehavior{
    @Override
    public void doDayTimeActivity() {
        System.out.println("Sleep");
    }



    @Override
    public void doNightTimeActivity() {
        System.out.println("Suck blood");
    }
}
