/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author priat
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(){
        
    }
    
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQucakBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    abstract void display();
    public void performFly(){
        flyBehavior.fly();
        
        
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void Swim(){
        System.out.println("all ducks float , even decoys!");
    }
        
}
