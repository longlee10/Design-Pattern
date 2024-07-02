package observer;

import java.util.ArrayDeque;
import java.util.Deque;

public class Observable {
    private Deque<Observer> observers = new ArrayDeque<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(var observer : observers)
            observer.update();
    }
}
