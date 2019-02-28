package java.awt;

public class Point {

    public int x;

    public int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
