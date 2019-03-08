package uia.j2a;

import android.graphics.Paint;
import android.graphics.Typeface;

import java.awt.Color;
import java.awt.Font;

public class Env2a {

    private static android.app.Application APP;

    private static boolean PAINT_ANTI_ALIAS_FLAG = true;

    public static void link(android.app.Application app) {
        APP = app;
    }

    public static void configPaintAntiAliasFlag(boolean enable) {
        PAINT_ANTI_ALIAS_FLAG = enable;
    }

    public static Paint createPaint() {
        return PAINT_ANTI_ALIAS_FLAG ? new Paint(Paint.ANTI_ALIAS_FLAG) : new Paint();
    }

    public static Typeface createTypeface(Font font) {
        return Typeface.create(font.getFamily(), font.getStyle());
    }
}
