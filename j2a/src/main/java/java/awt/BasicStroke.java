package java.awt;

public class BasicStroke implements Stroke {

    private float width;

    public BasicStroke(float width) {
        this.width = width;
    }

    public float getLineWidth() {
        return this.width;
    }

    @Override
    public Shape createStrokedShape(Shape p) {
        return p;
    }

    @Override
    public float widthAndroid() {
        return this.width;
    }
}
