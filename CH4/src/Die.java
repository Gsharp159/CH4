/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gagenshar36
 */
public class Die {
    int SIDES = 6;
    
    public Die(int s) {
        SIDES = 6;
    }
    
    public Die() {
        
    }
    
    public int Roll() {
        return (int)(Math.random() * SIDES + 6);
    }
}
