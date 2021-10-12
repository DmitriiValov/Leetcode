package utils;

public class Point {
    int x;
    int y;
    int step;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.step = 0;
    }

    public Point(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getStep() {
        return step;
    }
}
