package edu.neumont.jjensen.observertest;

/**
 * Created by jjensen on 11/4/14.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
