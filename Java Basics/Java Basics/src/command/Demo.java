package command;

import command.editor.BoldCommand;
import command.editor.Document;
import command.editor.History;
import command.editor.UndoCommand;
import command.framework.Button;

public class Demo {
    public static void main(String[] args) {
        var addCustomer = new AddCustomer(new CustomerService());
        var button = new Button(addCustomer);
        button.click();

        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        var doc = new Document();
        doc.setContent("Hello World");
        var history = new History();
        var boldCommand = new BoldCommand(doc, history);
        boldCommand.execute();

        System.out.println(doc.getContent());
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(doc.getContent());
    }
}
