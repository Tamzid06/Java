//This is one of two observer class here. weather history will be kept here
package observerpattern;

import java.util.ArrayList;
import java.util.List;


public class ForecastDisplay implements Observer {
    
    private List<Integer> tempHistory;
    private List<Integer> humidityHistory;
    
    public ForecastDisplay(Subject weatherStation) {
        tempHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        weatherStation.registerObserver(this);
        
    }

    @Override
    public void update(int temp, int humidity) {
        this.tempHistory.add(temp);
        this.humidityHistory.add(humidity);
        display7DaysHistory();
    }

    public void display7DaysHistory() {
        //print last 7 days history of temperature and humidity
        System.out.println("temp history: " +
                tempHistory.subList(Math.max(tempHistory.size() -7, 0), tempHistory.size()));
        System.out.println("humidity history: " +
                humidityHistory.subList(Math.max(humidityHistory.size() -7, 0), humidityHistory.size()));
    }
    
    
}
