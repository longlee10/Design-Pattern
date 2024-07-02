package com.codewithmosh.command;

public abstract class UndoableAbstract implements UndoableCommand{
    protected VideoEditor videoEditor;
    protected History history;

    protected UndoableAbstract(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    public void execute(){
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
