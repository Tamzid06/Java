// Author : Tamzid Hossain
// CSE,SUST
// Bangladesh

// prothom e ekti interface define korte hobe jate ekti method thakbe .ei method r return type hobe
// class ei interface k implement korbe tar object . r tai ekhan e villain_Clone() method r return type 
// holo Villain . 

interface VillainPrototype{  
    Villain villain_Clone();
}

abstract class Villain implements VillainPrototype{
    abstract void attack();
}

class VillainType1 extends Villain{
    private int hp,mp;

    VillainType1(int hp,int mp){
        super();
        this.hp=hp;
        this.mp=mp;
    }

    void attack(){
        System.out.println(" ATTACKING " + "hp= " + hp + " mp= " + mp);
    }

    public Villain villain_Clone(){
        System.out.println("fdfffffffffffff");
        return new VillainType1(this.hp,this.mp);
    }

}

class Prototype{
    public static void main(String[] args){
        Villain v = new VillainType1(100, 50);
        v.attack();
        Villain cloned = v.villain_Clone();
        // VillainType1 clone = v.villain_Clone();
        cloned.attack();
    }
}