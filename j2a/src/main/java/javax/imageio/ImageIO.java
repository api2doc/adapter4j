package javax.imageio;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ImageIO {

    public static BufferedImage read(File file) throws IOException {
        try {
            return read(new FileInputStream(file));
        }
        catch(IOException ex1) {
            throw ex1;
        }
        catch (Exception ex2) {
            throw new IOException(ex2);
        }
    }

    public static BufferedImage read(InputStream is) throws IOException {
        try {
            Bitmap bitmap = BitmapFactory.decodeStream(new BufferedInputStream(is));
            return new BufferedImage(bitmap);
        }
        catch (Exception ex2) {
            throw new IOException(ex2);
        }
    }

    public static boolean write(BufferedImage image, String formatName, File file) throws IOException {
        try {
            FileOutputStream out = new FileOutputStream(file);
            if ("png".equalsIgnoreCase(formatName)) {
                image.bitmapAndroid().compress(Bitmap.CompressFormat.PNG, 90, out);
            } else {
                image.bitmapAndroid().compress(Bitmap.CompressFormat.JPEG, 90, out);
            }
            out.flush();
            out.close();
            return true;
        }
        catch(IOException ex1) {
            throw ex1;
        }
        catch (Exception ex2) {
            throw new IOException(ex2);
        }
    }
}
