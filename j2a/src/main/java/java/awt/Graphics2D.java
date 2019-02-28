package java.awt;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import uia.j2a.Env;

public class Graphics2D extends Graphics {

    private final BufferedImage image;

    private Canvas canvas;

    private Paint paint;

    private Font font;

    private Color color;

    private Stroke stroke;

    public Graphics2D(BufferedImage image) {
        this.image = image;
        this.canvas = new Canvas(this.image.bitmapAndroid());

        this.paint = Env.createPaint();
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(Color.white.getRGB());
        this.paint.setTextSize(14);
        this.paint.setTypeface(Typeface.MONOSPACE);

        this.font = new Font(this.paint.getTypeface(), 14);
        this.color = Color.white;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.paint.setColor(color.getRGB());
        this.color = color;
    }

    @Override
    public Font getFont() {
        return this.font;
    }

    public void setFont(Font font) {
        this.paint.setTypeface(font.fontAndroid());
        this.paint.setTextSize(font.getSize());
        this.font = font;
    }

    @Override
    public void drawString(String str, int x, int y) {
        this.paint.setStyle(Paint.Style.FILL);
        this.canvas.drawText(str, x, y, paint);
        this.paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public FontMetrics getFontMetrics() {
        return new FontMetrics(this.paint);
    }

    public void drawOval(int x, int y, int width, int height) {
        this.canvas.drawOval(x, y, x + width, y + height, this.paint);
    }

    @Override
    public void drawRect(int x, int y, int width, int height) {
        this.paint.setStyle(Paint.Style.STROKE);
        this.canvas.drawRect(x, y, x + width, y + height, this.paint);
    }

    @Override
    public void fillRect(int x, int y, int width, int height) {
        this.paint.setStyle(Paint.Style.FILL);
        this.canvas.drawRect(x, y, x + width, y + height, this.paint);
        this.paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        this.paint.setStyle(Paint.Style.FILL);
        this.canvas.drawLine(x1, y1, x2, y2, paint);
        this.paint.setStyle(Paint.Style.STROKE);
    }

    public void setRenderingHint(RenderingHints.Key key, Object hintValue) {
        this.paint.setAntiAlias(true);
    }

    public void setStroke(Stroke stroke) {
        this.paint.setStrokeWidth(stroke.widthAndroid());
    }

    @Override
    public boolean drawImage(Image image, int x, int y, ImageObserver observer) {
        this.canvas.drawBitmap(image.bitmapAndroid(), x, y, paint);
        return true;
    }

    @Override
    public void translate(int x, int y) {
        this.canvas.translate(x, y);
    }

    @Override
    public void dispose() {
        // this.canvas.save();
    }

}
