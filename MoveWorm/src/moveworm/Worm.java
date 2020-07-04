package moveworm;

public class Worm {
    // position on board
    public int x;
    public int y;

    public int width;
    public int length;

    public String direction;
    double velX = 1, velY = 1;

    public Worm(){
        // default position
        this.x = 200;
        this.y = 200;

        // default size
        this.width = 10;
        this.length = 10;


    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
