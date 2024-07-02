package com.codewithmosh.memento;

public class DocumentState {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentState(String fontName, String content, int fontSize) {
        this.fontName = fontName;
        this.content = content;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
