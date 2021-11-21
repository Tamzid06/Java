//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....

/*
Decorator pattern attaches additional responsibilitis to an object Dynamically. Decorators
provide a flexible alternative to subclassing for extending functionality


Ei example e amra dekhbo kivabe subclass baniye implement na kore onnovabe amra functionality add korte pari.
dhora jak ekta coffeeshop ase, jekhane onk type er coffee pawa jay. Espresso, Dark roast, Lattee aro koto ki. Abr
kichhu ingredient o ase jegula tmi extra add kore custom banate parba, khoroch oo barbe.

Ei coffeeshop amra kivabe implement korbo? amra eta korte pari je, main ekta abstract class Coffee thakbe,jekhane price,name 
er jnno method thakbe jegula jodi keu extend kore tobe tader implement korte hobe. Then Espresso, Dark roast egula 
Coffee ke extend korbe. But ingredient er ki hobe? dhora jak 5 ta ingredient ase, ami ki protita subclass e 5 ta kore method
individually hat e likhe dibo? jhamela jeta hobe, kno ingredient bad/add hole amke protita subclass e hat dite hobe.

dynamically ei fucntionality add korar jonno amra jeta kori, arekta abstruct class niye ashi, CoffeeDecorator.
eta jeta kore, Coffee class ke empersonate kore/ implement kore.shutorang, keu jodi ekhn CoffeeDecorator ke extent kore,
tahole take Coffee class er jinishgulao implement korte hobe.

Ei CoffeeDecorator class ta dynamically ingredient add korte help korbe. Ja Ja ingredient ase, tara ei class takee extend
korbe. era Coffee class er object nibe, then nijer moto pricing add korbe abong name tag eo ingredient add korbe.

ar coffee er je type gula, ei class gula Coffee ke extend korbe


                            Coffee
            ................|    |................
            |                                    |
       CoffeeDecorator                        Espresso
        |           |
      WithMilk    WithSugar

*/
package decoratorpattern;

public class DecoratorPattern {

    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        printCoffee(espresso);
        
        espresso = new WithMilk(espresso);
        printCoffee(espresso);
        
        espresso = new WithSugar(espresso);
        printCoffee(espresso);
        
    }
    
    private static void printCoffee(Coffee c){
        System.out.println("cost: "+c.cost() + " Description: "+ c.getDescription());
    }
    
}
