package state;

public class Selection implements ToolType{
    @Override
    public void mouseDown() {
        System.out.println("Selection icon...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dashed rectangle...");
    }
}
