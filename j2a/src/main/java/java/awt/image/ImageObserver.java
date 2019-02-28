package java.awt.image;

import java.awt.Image;

public interface ImageObserver {

    public boolean imageUpdate(Image img, int infoFlags, int x, int y, int width, int height);
}
