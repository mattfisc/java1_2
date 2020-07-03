package moveworm;

public class Worm {
    public int x;
    public int y;

    public int width;
    public int length;

    public String direction;
    double velX = 1, velY = 1;

    public Worm(int x,int y){
        this.x = x;
        this.y = y;
        this.width = 10;
        this.length = 10;

        this.direction = "down";
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
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
