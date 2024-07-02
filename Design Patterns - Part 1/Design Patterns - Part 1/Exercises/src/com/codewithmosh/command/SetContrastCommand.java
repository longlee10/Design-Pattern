package com.codewithmosh.command;

public class SetContrastCommand extends UndoableAbstract{
    private float prevContrast;
    private float contrast;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, History history) {
        super(videoEditor, history);
        this.contrast = contrast;
    }

    @Override
    public void unexecute() {
        videoEditor.setContrast(prevContrast);
    }

    @Override
    protected void doExecute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(contrast);
    }
}
