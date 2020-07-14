package moveworm;

import java.util.Random;

public class Food {
    private Random rnd;
    public int x;
    public int y;
    public boolean eatten;

    public Food(){
        rnd = new Random();
        this.x = rnd.nextInt(390);
        this.y =  rnd.nextInt(390);
        eatten = false;
    }
}
