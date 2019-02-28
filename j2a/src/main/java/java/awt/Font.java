package java.awt;

import android.graphics.Typeface;

import org.jetbrains.annotations.Contract;

public final class Font {

    public final static int PLAIN = 0;

    public final static int BOLD = 1;

    public final static int ITALIC = 2;

    private Typeface typeFace;

    private int size;

    public Font(String name, int style, int size) {
        this.size = size;
        try {
            this.typeFace = Typeface.create(name, style);
        } catch (Exception ex) {
            this.typeFace = Typeface.MONOSPACE;
        }
    }

    public Font(Typeface typeFace, int size) {
        this.size = size;
        this.typeFace = typeFace == null ? Typeface.MONOSPACE : typeFace;
    }

    public String getFamily() {
        return this.typeFace.toString();
    }

    public boolean isBold() {
        return this.typeFace.isBold();
    }

    public boolean isItalic() {
        return this.typeFace.isItalic();
    }

    public boolean isPlain() {
        return !this.typeFace.isBold() && !this.typeFace.isItalic();
    }

    public int getStyle() {
        return this.typeFace.getStyle();
    }

    public int getSize() {
        return this.size;
    }

    public Typeface fontAndroid() {
        return this.typeFace;
    }
}
