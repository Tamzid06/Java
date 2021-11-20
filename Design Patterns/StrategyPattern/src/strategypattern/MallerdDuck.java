package strategypattern;

public class MallerdDuck extends Duck{
    public MallerdDuck(FlyBehaviour flyBehaviour){
        super(flyBehaviour);
    }
    
    public void performFly(){
        flyBehaviour.fly();
    }
}
