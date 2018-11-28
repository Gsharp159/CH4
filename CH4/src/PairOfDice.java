/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gagenshar36
 */
public class PairOfDice {
    int NUMBEROFDICE;
    Die Die = new Die();
    
    public PairOfDice(int number) {
        NUMBEROFDICE = number;
    }
    
    public int roll(){
        return (Die.Roll() + Die.Roll());
    }
    
    public boolean checkOneTwo() {
        
    }
}
