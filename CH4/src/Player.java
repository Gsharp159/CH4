/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gagenshar36
 */
public class Player {
    private int total;
    private int cur_total;
    PairOfDice paradise = new PairOfDice(2);
    
    public Player() {
        
    }
    
    public void total(int poo) {
        total = poo;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void roll() {
        paradise.roll();
    }
    
    
    
}
