//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....

/*
Interface segregation principle states that, Clients should not be forced to depend upon any interfaces/methods that they do not use.

The goal of this principle is to reduce the side effects of using larger interfaces by breaking application interfaces into smaller ones

Here,in the Pizza interface, there are so many methods to override and taken care of.But an avarage customer doesn't want that much
modification and complexity to order a pizza. a customer have to do a lot here , forced to define the variables.
So we can say that this Pizza interface is considered a polluted interface.
*/
interface Pizza{
    void doughType();
    void addCheeze();
    void addOlive();
    boolean chickenOrBeef();
    boolean addPepperoni();
    void addMashroom();
    void cookingTime(int n);
}

class OrderPizza implements Pizza{

    @Override
    public void doughType() {
        System.out.println("SourDough");

    }

    @Override
    public void addCheeze() {
        System.out.println("Mozzerella added");

    }

    @Override
    public void addOlive() {
        System.out.println("Black olive added");

    }

    @Override
    public boolean chickenOrBeef() {
        return true;
    }

    @Override
    public boolean addPepperoni() {
        System.out.println("Want some pepperoni?");
        return false;
    }

    @Override
    public void addMashroom() {
        System.out.println("king mashroom added to the toppings");

    }

    @Override
    public void cookingTime(int n) {
        System.out.println("Pizza is cooked in the oven for "+n+" minutes");
    }   
}

public class IntrfcSeg_Inefficient {
    public static void main(String[] args){
        System.out.println("check");

    }
    
}
