/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hill.race;

import environment.Environment;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author LK
 */
class Sahara extends Environment {

    public Sahara() {
    }
    
    int counter;

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    //    System.out.println("Hey dude.." + --counter);
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    //    System.out.println("Key Press" + e.getKeyChar());
    //    System.out.println("Key Press" + e.getKeyCode());
        
        if(e.getKeyCode() == KeyEvent.VK_W) {
            System.out.println("UP");
    }
        if(e.getKeyCode() == KeyEvent.VK_S){
            System.out.println("DOWN");
        }
        if(e.getKeyCode() == KeyEvent.VK_A){
            System.out.println("LEFT");
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            System.out.println("RIGHT");
        }
        
        
            
        
        
        
        
        
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
    }

}
