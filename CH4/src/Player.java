public class Player {
    private int total;
    private int cur_total;
    PairOfDice paradice = new PairOfDice(2);
    
    public Player() {
        
    }
    
    public void total(int poo) {
        total = poo;
    }
    
    public int getTotal() {
        return total;
    }
    
    public void roll() {
        paradice.roll();
        
    }
    
    
    
}
