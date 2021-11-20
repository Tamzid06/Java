package strategypattern;

public class RedDuck extends Duck{
    public RedDuck(FlyBehaviour flyBehaviour){
        super(flyBehaviour);
    }
    
    public void performFly(){
        flyBehaviour.fly();
    }
}
