//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....

/*

Liskov substitution principle says that: if a child object is refered by the parent type , this should not
affect any functionality of the code.
Say, A class Rectangle and it's child Squre

class Rectangle{
    double hight;
    double width;

    setHight();
    setWidth();
}

class Square extends Rectangle{
    setside();
}

now, if i write these two lines of code
    Rectangle sqr = new Square();
    sqr.setside();

this will create problem, as there's no setside() in Rectangle class. But Liskov principle says that the code
should be designed in such a way that this should not create a problem.
*/

/*
here,two class BlackCoffee and ColdCoffee extends to Coffee. So, if instance of Coldcoffee is refered by Coffe,this 
should not create a problem. But here we can see that we cannot do that as ColdCoffee has an extra method addIce.
*/
class Coffee{
    double sugeramount;
    double coffeeamount;
    double creameramount;

    Coffee(double sugeramount,double coffeeamount,double creameramount){
        this.sugeramount = sugeramount;
        this.coffeeamount = coffeeamount;
        this.creameramount = creameramount;

        groundCoffee();
        addSuger();
        addCreamer();
    }

    void groundCoffee(){
        System.out.println("Coffee finely grounded and brewed");
    }
    void addSuger(){
        System.out.println("suger added");
    }
    void addCreamer(){
        System.out.println("Add creamer as u need");
    }
}

class BlackCoffee extends Coffee{

    BlackCoffee(double sugeramount, double coffeeamount, double creameramount) {
        super(sugeramount, coffeeamount, creameramount);
    }
    void addSuger(){
        System.out.println("sorry no suger here");
    }
    void addCreamer(){
        System.out.println("Sorry no cream here");
    }

}

class ColdCoffee extends Coffee{

    ColdCoffee(double sugeramount, double coffeeamount, double creameramount) {
        super(sugeramount, coffeeamount, creameramount);
    }

    void addIce(){
        System.out.println("Ice is added to the coffee");
    }

}
public class Liscov_Inefficient {
    public static void main(String[] args){
        Coffee coffee = new Coffee(2, 5, 3);
        BlackCoffee blackCoffee = new BlackCoffee(0, 5 , 0);
        Coffee coldcoffee = new ColdCoffee(5, 10 , 5);
        //coldcoffee.addIce();
    }
    
}
