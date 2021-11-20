/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    
    public Duck(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    
    public void performFly(){
        flyBehaviour.fly();
    }
    
}
