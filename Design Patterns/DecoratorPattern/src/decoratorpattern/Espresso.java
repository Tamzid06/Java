/*
ekta coffee type, Coffee ke implement kore
 */
package decoratorpattern;

public class Espresso extends Coffee {
    
    public Espresso(){
        description = "Espresso";
    }
    
    @Override
    public double cost() {
        return 1.99;
    }
    
}
