/*
Main Coffee class. Shob coffee etake extend korbe
 */
package decoratorpattern;


public abstract class Coffee {
    
    String description = "Unknown COffee";
    
    public String getDescription(){
        return description;
    }
    //eta cost fucntion, prottek coffee type ke eta implement korte hobe
    public abstract double cost();
}
