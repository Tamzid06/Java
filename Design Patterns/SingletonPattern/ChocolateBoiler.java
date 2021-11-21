// Author: Tamzid Hossain
// CSE,SUST
// Bangladesh

// majhemoddhe emn hoy je kono ekta class er instance ektar beshi hoye gele shomosshar srishti kore, tokhn emn ekta system banate hoy jeno
//oi class er instance ektar beshi create na kora jay. dhora jak, amader ekta GPU ase, jetar jnno amra ekta driver banabo. ekhn ei driver class er
// jodi onekgula hoye jay, shekhetre ei shared resource ta(gpu) fucntion koranoy onk shomossha srishti hobe. eishob shared resources er jnno amra ekta driver er
// though tei shob kaj korate chai. ekhetre singleton pattern lagbe.

//dhora jak amr ekta chocolate factory ase,tar moddhe ChocolateBoiler ekta machine ase.eita controll er jnno amra ekta driver banachchhi. Eikhane ami first e 
// boiler ta fill korbo, then boil korbo, then drain korbo.evabe cycle cholbe,but ei sequence ta ulta palta howa jabena.

//constructor private kore, object create er jnno alada ekta public static method use kore, Chocolate boiler er ekta private static instance rekhe amra ei kaj korte pari

// but shomossa holo, ei driver object create e jodi ektu beshi time lage, tahole thread jonito karon ee null checking ta bypass hoye jete pare. meaning ekadhik instance create 
// hoye jabe.

// ekadhik thread jate ekta method ke eki shathe access korte na pare, ejonno amra synchronize korbo. constructor er shathe shathe method gulakeo shole synchronize 
// korte hobe. jate eki boler 2 bar fill na hoy ba 2 bar boil na hoy emn

// method synchronize korata efficient na, karon ekta synchronized method jkhn call kora hoy she pura class tare lock kore fele. method synchronize na kore jodi amra
// ekta code block synchronize kori sheta onk optimized.

public class ChocolateBoiler {
    private boolean empty,boiled;

    public boolean isEmpty() { return empty; }
    public boolean isBoiled() { return boiled; }

    int signature;

    private static ChocolateBoiler uniqueInstance = null;  /// etai amr unique instance. jotobar ee instance banate chai na kno ekbar ee banate parbo.then etai return hobe

    private ChocolateBoiler(){                          // Constructor private kore dilam jate bahir theke keu call dite na pare
        empty = true;
        boiled = false;
    }

    public synchronized static ChocolateBoiler getUniqueInstance(){      // public static kora jeno instance create na korei ei method ke call kora jay
        if(uniqueInstance == null)
            uniqueInstance = new ChocolateBoiler();
        
        return uniqueInstance;
    }

    /*
    amra jodi method synchronize na kore block synchronize kortam tahole code ta emn hoto
    kno duibar check korte hobe no idea. just vitorer ta thaklei hoy

    public static ChocolateBoiler getUniqueInstance(){   
        if(uniqueInstance == null){
            synchronized(ChocolateBoiler.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateBoiler();
                }
            }

        }
           
        return uniqueInstance;
    }
    */

    public synchronized void fill(){
        if(isEmpty()){
            System.out.println("Filling chocolate and milk");
            empty = false;
            boiled = false;
        }
        else{
            System.out.println("Can't fill: boiler is already filled");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            System.out.println("Oo.oO boiling chocolate and milk");
            boiled = true;
        }
        else{
            if(isEmpty()) System.out.println("Can't boil: Boiler is empty");
            else System.out.println("Can't boil: Already boiled");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            System.out.println("Draining chocolate bars");
            empty = true;
        }
        else{
            if(isEmpty()) System.out.println("Can't drain: Boiler is empty");
            else System.out.println("Can't drain: Not boiled yet");
        }
    }
}
