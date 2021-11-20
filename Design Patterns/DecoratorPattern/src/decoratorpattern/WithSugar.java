/*
Ingredient sugar
 */
package decoratorpattern;

public class WithSugar extends CoffeeDecorator{

    Coffee coffee;
    //we are taking a base coffee here and holding a reference to it
    public WithSugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,Sugar" ;
    }

    @Override
    public double cost() {
        return coffee.cost()+ .25 ;
    }
    
}
