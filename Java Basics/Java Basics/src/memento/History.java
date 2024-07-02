package memento;

import java.util.LinkedList;

public class History {
    // Linked list allows O(1) run time complexity in all operations.
    private LinkedList<EditorState> undoList = new LinkedList<>();
    private LinkedList<EditorState> redoList = new LinkedList<>();

    public void push(EditorState state){
        undoList.addLast(state);
    }

    // check run time complexity
    public EditorState undo(){
        var lastState = undoList.removeLast();
        redoList.addFirst(lastState);
        return lastState;
    }

    public EditorState redo(){
        var firstState = redoList.removeFirst();
        undoList.addLast(firstState);
        return firstState;
    }
}
