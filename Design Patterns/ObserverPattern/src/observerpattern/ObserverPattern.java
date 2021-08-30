
package observerpattern;

import java.util.Random;


public class ObserverPattern {

    
    public static void main(String[] args) throws InterruptedException {
        // Create the data object (publisher / topic)
        WeatherStation weatherStation = new WeatherStation();
        
        //create and register our display (observer / subscribers)
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);
        
        //simulate updates
        for (int i=0 ; i<5 ;i++) {
            System.out.println("\n--- Update " + i + "----");
            
            int randTemp = getRandomint(-50, 40) ;
            int randHum = getRandomint(0, 100) ;
            
            weatherStation.measurementChanged(randTemp, randHum);
            
            
            
            Thread.sleep(1000);
        }
        
    }

    private static int getRandomint(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max+1-min) + min;
    }
    
}
