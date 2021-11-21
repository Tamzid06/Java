//..........Author : Tamzid Hossain.............
// .........CSE,SUST............................
// .........Bangladesh..........................
//..........Mail: tamzidh@acm.org...............
//................tamzid.cse.sust@gmail.com.....

////etar template amra 2 vabe banate pari. ekta emn hote pare je,  makeJuice ta abstract thakbe, shobai shobar moto sheta implement kore nibe

abstract class JuiceMaker1{
    void pourWater(){}
    void serve(){}
    void blend(Object ob){}      
    void addSugar(int q){}
    void refrigerate(int min){}

    abstract void makeJuice();

}

class MangoJuiceMaker1 extends JuiceMaker1{
    void makeJuice(){
        pourWater();
        blend("Mango");
        addSugar(2);
        refrigerate(20);
        serve();
    }
}

class OrangeJuiceMaker1 extends JuiceMaker1{
    void makeJuice(){
        pourWater();
        blend("Orange");
        addSugar(3);
        refrigerate(30);
        serve();
    }
}

/// Arekta solution hote pare, jei method gula jhamelar, mane parameter ney oigula just abstract kore dibo

abstract class JuiceMaker2{
    void pourWater(){}
    void serve(){}

    void makeJuice(){
        pourWater();
        blend();
        addSugar();
        refrigerate();
        serve();
    }

    abstract void blend();
    abstract void addSugar();
    abstract void refrigerate();

}

class MangoJuiceMaker2 extends JuiceMaker2{

    @Override
    void blend() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void addSugar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void refrigerate() {
        // TODO Auto-generated method stub
        
    }
    
}

class OrangeJuiceMaker2 extends JuiceMaker2{

    @Override
    void blend() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void addSugar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    void refrigerate() {
        // TODO Auto-generated method stub
        
    }
    
}

public class Template_good {
    
}
