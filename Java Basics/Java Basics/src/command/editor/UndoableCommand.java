package command.editor;

import command.framework.Command;

public interface UndoableCommand extends Command {
    void unexecute();
}
