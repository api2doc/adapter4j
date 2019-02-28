package java.awt;

public class Rectangle {

    public int x;

    public int y;

    public int width;

    public int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public Point getLocation() {
        return new Point(this.x, this.y);
    }

    public void setLocation(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }
}
