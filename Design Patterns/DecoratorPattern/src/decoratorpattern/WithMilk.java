/*
Milk add korar jnno ei class. eta ekta Coffee class er object niye milk add kore dibe
 */
package decoratorpattern;

public class WithMilk extends CoffeeDecorator{
    
    Coffee coffee;
    
    //we are taking a base coffee here and holding a reference to it
    public WithMilk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" ,Milk" ;
    }

    @Override
    public double cost() {
        return coffee.cost()+ .50 ;
    }
    
}
