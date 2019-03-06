package java.awt;

import org.jetbrains.annotations.Contract;

public final class Color {

    private final int color;

    public final static Color black = new Color(0xff000000);

    public final static Color BLACK = new Color(0xff000000);

    public final static Color blue = new Color(0xff0000ff);

    public final static Color BLUE = new Color(0xff0000ff);

    public final static Color cyan = new Color(0xff00ffff);

    public final static Color CYAN = new Color(0xff00ffff);

    public final static Color darkGray = new Color(0xffa9a9a9);

    public final static Color DARK_GRAY = new Color(0xffa9a9a9);

    public final static Color gray = new Color(0xff808080);

    public final static Color GRAY = new Color(0xff808080);

    public final static Color green = new Color(0xff00ff00);

    public final static Color GREEN = new Color(0xff00ff00);

    public final static Color lightGray = new Color(0xffd3d3d3);

    public final static Color LIGHT_GRAY = new Color(0xffd3d3d3);

    public final static Color magenta = new Color(0xffff00ff);

    public final static Color MAGENTA = new Color(0xffff00ff);

    public final static Color orange = new Color(0xffffa500);

    public final static Color ORANGE = new Color(0xffffa500);

    public final static Color pink = new Color(0xffffc0cb);

    public final static Color PINK = new Color(0xffffc0cb);

    public final static Color red = new Color(0xffff0000);

    public final static Color READ = new Color(0xffff0000);

    public final static Color white = new Color(0xffffffff);

    public final static Color WHITE = new Color(0xffffffff);

    public final static Color yellow = new Color(0xffffff00);

    public final static Color YELLOW = new Color(0xffffff00);

    public Color() {
        this(255, 255, 255);
    }

    public Color(int red, int green, int blue) {
        int color = 0xff000000;
        color = color | (red << 16);
        color = color | (green << 8);
        color = color | blue;

        this.color = color;
    }

    public Color(int red, int green, int blue, int alpha) {
        int color = alpha << 24;
        color = color | (red << 16);
        color = color | (green << 8);
        color = color | blue;

        this.color = color;
    }

    public Color(int color) {
        this.color = color;
    }

    public int getRed() {
        return android.graphics.Color.red(color);
    }

    public int getBlue() {
        return android.graphics.Color.blue(color);
    }

    public int getGreen() {
        return android.graphics.Color.green(color);
    }

    public int getAlpha() {
        return android.graphics.Color.alpha(color);
    }

    public int getRGB() {
        return this.color;
    }
}
