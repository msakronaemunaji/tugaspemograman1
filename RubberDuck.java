/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author priat
 */
public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new FlyNoWay() {
            @Override
            public void fly() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        quackBehavior = () -> System.out.println("squeak");
        
        
    }
    public RubberDuck (FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior=flyBehavior;
        this.quackBehavior=quackBehavior;
        
    }
    @Override
   public void display(){
    System.out.println("im a Rubber duckie");
            }
    
}
