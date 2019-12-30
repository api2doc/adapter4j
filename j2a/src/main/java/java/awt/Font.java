package java.awt;

import android.graphics.Typeface;

import org.jetbrains.annotations.Contract;

public final class Font {

    public final static int PLAIN = 0;

    public final static int BOLD = 1;

    public final static int ITALIC = 2;

    private final String name;

    private final int size;

    private Typeface typeFace;

    public Font(String name, int style, int size) {
        this.size = size;
        try {
            this.typeFace = Typeface.create(name, style);
        } catch (Exception ex) {
            this.typeFace = Typeface.MONOSPACE;
        }
        this.name = name;
    }

    public Font(Typeface typeFace, int size) {
        this.size = size;
        this.typeFace = typeFace == null ? Typeface.MONOSPACE : typeFace;
        this.name = this.typeFace.toString();
    }

    public Font(Typeface typeFace, int size, String name) {
        this.size = size;
        this.typeFace = typeFace == null ? Typeface.MONOSPACE : typeFace;
        this.name = name;
    }

    public String getFamily() {
        return this.name;
    }

    public String getFontName() {
        return this.name;
    }

    public String getName() {
        return this.name;
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

    public Font deriveFont(int style, float size) {
        return new Font(Typeface.create(this.typeFace, style), (int)size);
    }

    public Font deriveFont(int style) {
        return new Font(Typeface.create(this.typeFace, style), (int)this.size);
    }

    public Font deriveFont(float size) {
        return new Font(this.typeFace, (int)size);
    }

    public Typeface fontAndroid() {
        return this.typeFace;
    }
}
