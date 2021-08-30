/*
This is a subject/publisher class,observers will observe each change of it's state. so it must implement the subject interface
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temp;
    private int humidity;
    
    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int observerIndex = observers.indexOf(o); // Do i have this observer?
        if(observerIndex >= 0 )
            observers.remove(observerIndex);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o-> o.update(temp, humidity));
    }
    
    //this method is called in the weatherstation object,when the value changes
    public void measurementChanged(int temp, int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObservers();
    }
    
}
