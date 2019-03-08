package java.awt;

import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public abstract class Graphics {

    public abstract Color getColor();

    public abstract Font getFont();

    public abstract FontMetrics getFontMetrics();

    public void drawRect(int x, int y, int width, int height) {
    }

    public abstract void fillRect(int x, int y, int width, int height);

    public abstract void drawString(String str, int x, int y);

    public abstract void drawString(AttributedCharacterIterator iterator, int x, int y);

    public abstract void drawLine(int x1, int y1, int x2, int y2);

    public abstract boolean drawImage(Image image, int x, int y, ImageObserver observer);

    public abstract void translate(int x, int y);

    public abstract void dispose();
}
