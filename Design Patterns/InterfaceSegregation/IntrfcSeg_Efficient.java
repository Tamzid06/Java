//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....


/*
To solve this problem, what we can do is we can split the Pizza inteface that had too many implementetion into to seperate interface,
SimplePizza and ModifiedPizza. Those who wants to order the simple pizza will implement the SimplePizza, and who wants their pizza
a bit different wil implement both SimplePizza and PizzaModification
*/
interface SimplePizza{
    void doughType();
    void addCheeze();
    void addOlive();
}

interface PizzaModification{
    boolean chickenOrBeef();
    boolean addPepperoni();
    void addMashroom();
    void cookingTime(int n);
}

class OrderSimplePizza implements SimplePizza{

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
}

class OrderPizza implements SimplePizza,PizzaModification{

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

public class IntrfcSeg_Efficient {
    public static void main(String[] args){
        System.out.println("check");

    }
}
