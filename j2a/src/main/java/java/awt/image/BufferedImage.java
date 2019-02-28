package java.awt.image;

import android.graphics.Bitmap;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class BufferedImage extends Image {

    public final static int TYPE_3BYTE_BGR = 1;

    public final static int TYPE_4BYTE_ABGR = 2;

    public final static int TYPE_4BYTE_ABGR_PRE = 4;

    public final static int TYPE_BYTE_BINARY = 8;

    public final static int TYPE_BYTE_GRAY = 16;

    public final static int TYPE_BYTE_INDEXED = 32;

    public final static int TYPE_CUSTOM = 64;

    public final static int TYPE_INT_ARGB = 128;

    public final static int TYPE_INT_ARGB_PRE = 256;

    public final static int TYPE_INT_BGR = 512;

    public final static int TYPE_INT_RGB = 1024;

    public final static int TYPE_USHORT_555_RGB = 2048;

    public final static int TYPE_USHORT_565_RGB = 4096;

    public final static int TYPE_USHORT_GRAY = 8192;

    private final Bitmap b;

    private final int imageType;

    public BufferedImage(int width, int height, int imageType) {
        this.b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.imageType = imageType;
    }

    public BufferedImage(Bitmap b) {
        this.b = b;
        this.imageType = TYPE_INT_ARGB;
    }

    public int getType() {
        return this.imageType;
    }

    public Graphics2D createGraphics() {
        return new Graphics2D(this);
    }

    public int getWidth() {
        return this.b.getWidth();
    }

    public int getHeight() {
        return this.b.getHeight();
    }

    public BufferedImage getSubimage(int x, int y, int width, int height) {
        return new BufferedImage(Bitmap.createBitmap(this.b, x, y, width, height));
    }

    public int getRGB(int x, int y) {
        return 0x00ffffff & this.b.getPixel(x, y);
    }

    @Override
    public Graphics getGraphics() {
        return createGraphics();
    }

    @Override
    public Image getScaledInstance(int width, int height, int hints) {
        return new BufferedImage(Bitmap.createScaledBitmap(this.b, width, height, false));
    }

    @Override
    public Bitmap bitmapAndroid() {
        return this.b;
    }
}
