// Author : Md. Fahimul Islam

interface Kick_the_Football{
    String kick_status();
    String kicked();
}

interface Can_be_kicked{
    String kicked();
    String Not_kicked();   
}

class Kick_process_Football implements Kick_the_Football{

    Can_be_kicked can_kick ;
    String k;
    String out;

    Kick_process_Football(Can_be_kicked can_kick){
        this.can_kick = can_kick;
        this.k = "no";

    }
    @Override
    public String kick_status(){
        return this.k;
    }



    @Override
    public String kicked() {
        String is_kicked = kick_status();
        if (is_kicked == "yes") {
            out = can_kick.Not_kicked();
            this.k = "no";
        } else if(is_kicked == "no") {
            out = can_kick.kicked();
            this.k = "yes";
        }
        return out;
        
    }

}


class Football implements Can_be_kicked{

    @Override
    public String kicked() {
        String a = "Football is kicked";
        return a;
    }

    @Override
    public String Not_kicked() {
        String a = "Football is not kicked";
        return a;
    }

}

public class DependencyInversionEfficient {
    public static void main(String[] args){
        Can_be_kicked canBe = new Football();
        System.out.println(canBe.kicked());
    }
    
}
