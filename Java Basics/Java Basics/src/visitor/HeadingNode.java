package visitor;

public class HeadingNode implements HTMLNode{
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
