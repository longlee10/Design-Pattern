package com.codewithmosh.command;

public class SetTextCommand extends UndoableAbstract{
    private String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.text = text;
    }

    @Override
    public void unexecute() {
        videoEditor.removeText();
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }
}
