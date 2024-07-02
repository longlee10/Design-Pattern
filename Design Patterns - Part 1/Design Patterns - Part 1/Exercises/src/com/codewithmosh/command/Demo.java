package com.codewithmosh.command;

public class Demo {
    public static void main(String[] args) {
        var history = new History();
        var video = new VideoEditor();

        var setContrast = new SetContrastCommand(1.5f, video, history);
        setContrast.execute();

        var setText = new SetTextCommand("Hello World", video, history);
        setText.execute();

        var undo = new UndoCommand(history);
        undo.execute();

        System.out.println(video);
    }
}
