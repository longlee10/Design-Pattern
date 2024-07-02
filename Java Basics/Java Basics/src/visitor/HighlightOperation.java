package visitor;

public class HighlightOperation implements Operation{

    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlighting text in heading...");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Highlighting text in anchor...");
    }


}
