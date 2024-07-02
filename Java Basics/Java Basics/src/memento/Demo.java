package memento;

public class Demo {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.goToState(history.undo());
        editor.goToState(history.undo());

        editor.goToState(history.redo());
        editor.goToState(history.undo());

        System.out.println(editor.getContent());
    }
}
