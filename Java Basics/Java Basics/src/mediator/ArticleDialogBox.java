package mediator;

public class ArticleDialogBox {
    private ListBox listBox = new ListBox();
    private TextBox textBox = new TextBox();
    private Button button = new Button();

    public ArticleDialogBox(){
        listBox.attach(this::listBoxSelected);
        textBox.attach(this::textBoxSelected);
    }

    public void simulateUserInteraction(){
        listBox.setSelection("Article 1");
        textBox.setContent("");
        System.out.println("Text box: " + textBox.getContent());
        System.out.println("Button is enabled: " + button.isEnabled());
    }

    private void listBoxSelected(){
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }

    private void textBoxSelected(){
        var content = textBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }
}
