package command.editor;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<UndoableCommand> commandList = new ArrayList<>();

    public void push(UndoableCommand command){
        commandList.add(command);
    }

    public UndoableCommand pop(){
        return commandList.removeLast();
    }

    public int size(){
        return commandList.size();
    }
}
