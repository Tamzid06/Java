//This is one of two observer class here. 
package observerpattern;

public class CurrentConditionDisplay implements Observer{

    private int temp;
    private int humidity;
    
    public CurrentConditionDisplay(Subject weatherStation){
        weatherStation.registerObserver(this);
    }
    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        displayCurrent();
        
    }

    public void displayCurrent() {
        System.out.println("Current Temperature: " + temp);
        System.out.println("Current Humidity: " + humidity);
    }
    
}
