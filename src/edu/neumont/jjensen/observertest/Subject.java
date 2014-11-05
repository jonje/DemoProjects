package edu.neumont.jjensen.observertest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jjensen on 11/4/14.
 */
public class Subject {
    private List<Observer> observers = new ArrayList();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
