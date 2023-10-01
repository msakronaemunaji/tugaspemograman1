/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author priat
 */
public class DecoyDuck extends Duck{
    public  DecoyDuck(){
        setFlyBehavior(new FlyNoWay() {
            @Override
            public void fly() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        setQuackBehavior(new MuteQuack());
        
        
        
    }
    @Override
    public void display(){
        System.out.println("ima set duck Decoy");
    }

    private void setQuackBehavior(MuteQuack muteQuack) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
