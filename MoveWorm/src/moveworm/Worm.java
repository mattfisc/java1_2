package moveworm;

public class Worm {
    public int x_start;
    public int y_start;
    public int width;
    public int length;

    public char up;
    public char down;
    public char right;
    public char left;

    public Worm(int x_start,int y_start,int width,int length){
        this.x_start = x_start;
        this.y_start = y_start;
        this.width = width;
        this.length = length;

        this.up = '0';
        this.down = 's';// default down
        this.right = '0';
        this.left = '0';
    }
}
