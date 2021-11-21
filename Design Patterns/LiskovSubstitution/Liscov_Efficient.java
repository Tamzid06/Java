//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....


/*
here,We implement the Coffee class in such a way that every possible combination of coffee can be made by overriding the methods
all methods will be given previously, one just need to implement accordingly.Therefore, Liskov substitute principle is implemented
*/
class Coffee{
    double sugeramount;
    double coffeeamount;
    double creameramount;
    double iceamount;

    Coffee(double sugeramount,double coffeeamount,double creameramount){
        this.sugeramount = sugeramount;
        this.coffeeamount = coffeeamount;
        this.creameramount = creameramount;

    }

    void groundCoffee(){}
    void addSuger(){}
    void addCreamer(){}
    void addIce(int ice){}
    void addGoatMilk(){}
    void blendWell(){}
}

class BlackCoffee extends Coffee{

    BlackCoffee(double sugeramount, double coffeeamount, double creameramount) {
        super(sugeramount, coffeeamount, creameramount);
    }

    void groundCoffee(){
        System.out.println("Coffee perfectly grounded");
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

    void groundCoffee(){
        System.out.println("Coffee perfectly grounded");
    }
    void addSuger(){
        System.out.println(sugeramount+" teaspoon suger added");
    }
    void addCreamer(){
        System.out.println(creameramount+ " teaspoon creamer added");
    }
    void addIce(int ice){
        System.out.println(ice+ " cube of Ice is added to the coffee");
    }
}

class Cuppucino extends Coffee{

    Cuppucino(double sugeramount, double coffeeamount, double creameramount) {
        super(sugeramount, coffeeamount, creameramount);
    }

    void groundCoffee(){
        System.out.println("Coffee perfectly grounded");
    }
    void addSuger(){
        System.out.println(sugeramount+" teaspoon suger added");
    }
    void addGoatMilk(){
        System.out.println("Goatmilk added");
    }
    void blendWell(){
        System.out.println("Blended and served");
    }
    
}
public class Liscov_Efficient {
    public static void main(String[] args){
        Coffee coffee = new Coffee(2, 5, 3);
        BlackCoffee blackCoffee = new BlackCoffee(0, 5 , 0);
        Coffee coldcoffee = new ColdCoffee(5, 10 , 5);
        coldcoffee.addIce(5);
    }
}
