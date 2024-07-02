package visitor;

public class Demo {
    public static void main(String[] args) {
        var anchorNode = new AnchorNode();
        var headingNode = new HeadingNode();

        var highlight = new HighlightOperation();
        var plainText = new PlainTextOperation();

        var document = new HTMLDocument();
        document.add(anchorNode);
        document.add(headingNode);

        document.execute(highlight);
        document.execute(plainText);
    }
}
