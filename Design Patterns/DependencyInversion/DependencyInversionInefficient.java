// Author : Md. Fahimul Islam

/*
The Dependency Inversion Principle (DIP) states that high level modules should not depend on low level modules; both should depend on abstractions.
Abstractions should not depend on details. Details should depend upon abstractions.
*/


class Kick_the_Football {
    public String kicked() {
        String a = "Football is kicked";
        return a;

        // System.out.println("Football is kicked");
    }
    public String Not_kicked(){
        String a = "Football is not kicked";
        return a;
        // System.out.println("Football is not kicked");
    }
}


class Football{
    Kick_the_Football kick;
    String k ;
    String aa;
    Football(Kick_the_Football kick) {
        this.kick = kick;
        this.k = "no";
    }
    public String kick_status(){
        return this.k;
    }
    public String kicked(){
        
        String is_kicked = kick_status();
        if (is_kicked == "yes") {
            aa = kick.Not_kicked();
            this.k = "no";
        } else if(is_kicked == "no") {
            aa = kick.kicked();
            this.k = "yes";
        }
        return aa;
    }
    
}



public class DependencyInversionInefficient {
    public static void main(String[] args){
        Kick_the_Football kick = new Kick_the_Football();
        Football ftbl = new Football(kick);
        System.out.println(ftbl.kicked());
    }
    
}
