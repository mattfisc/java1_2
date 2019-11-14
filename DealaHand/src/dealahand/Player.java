/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealahand;


public class Player {
    
    private String name = null;
    private Card[] hand = null;
    
    public Player(String name){
        this.name = name;
        
    }
    
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getHand() {
        return hand;
    }

    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    
    
    
}
