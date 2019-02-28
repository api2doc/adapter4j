package java.awt;

import android.graphics.Paint;

public class FontMetrics {

    private Paint paint;

    private int leading;

    private int ascent;

    private int descent;

    private int height;

    public FontMetrics(Paint paint) {
        this.paint = paint;
        this.leading = Math.abs((int) this.paint.getFontMetrics().leading);
        this.ascent = Math.abs((int) this.paint.getFontMetrics().ascent);
        this.descent = Math.abs((int) this.paint.getFontMetrics().descent);
        this.height = this.leading + this.ascent + this.descent;
    }

    public int getLeading() {
        return this.leading;
    }

    public int getAscent() {
        return this.ascent;
    }

    public int getDescent() {
        return this.descent;
    }

    public int getHeight() {
        return this.height;
    }

    public int stringWidth(String content) {
        return (int) this.paint.measureText(content);
    }

    public Paint paintAndroid() {
        return this.paint;
    }
}
