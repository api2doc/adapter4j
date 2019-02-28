package java.awt;

import android.graphics.Bitmap;

public abstract class Image {

    public static final int SCALE_DEFAULT = 1;

    public static final int SCALE_FAST = 2;

    public static final int SCALE_REPLICATE = 4;

    public static final int SCALE_SMOOTH = 8;

    public static final int SCALE_AREA_AVERAGING = 16;

    public abstract Graphics getGraphics();

    public abstract Image getScaledInstance(int width, int height, int hints);

    public abstract Bitmap bitmapAndroid();
}
