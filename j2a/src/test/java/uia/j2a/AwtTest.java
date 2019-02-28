package uia.j2a;

import android.graphics.Typeface;

import org.junit.Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import static org.junit.Assert.assertEquals;

public class AwtTest {

    @Test
    public void testColor() {
        Color red = Color.red;
        int a = red.getAlpha();
        int r = red.getRed();
        int g = red.getGreen();
        int b = red.getBlue();
        int argb = red.getRGB();

        assertEquals(255, a);
        assertEquals(255, r);
        assertEquals(0, g);
        assertEquals(0, b);
        assertEquals(0xffff0000, argb);
    }

    @Test
    public void testFont() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        Typeface arial = Env.createTypeface(font);
        System.out.println(arial);

        assertEquals("Arial", font.getFamily());
        assertEquals(false, font.isBold());
        assertEquals(16, font.getSize());
    }

    @Test
    public void testImage() {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d = image.createGraphics();

        // font
        FontMetrics fm = g2d.getFontMetrics();
        System.out.println(fm.getAscent());
        System.out.println(fm.getDescent());
        System.out.println(fm.getLeading());
        System.out.println(fm.getHeight());
        System.out.println(fm.stringWidth("134343"));
    }
}