package moveworm;

public class Worm {
    // position on board
    public double x;
    public double y;

    public double width;
    public double length;

    public String direction;
    double velX = .7, velY = .7;

    public Worm(){
        // default position
        this.x = 195;
        this.y = 195;

        // default size
        this.width = 10;
        this.length = 10;


    }


    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
