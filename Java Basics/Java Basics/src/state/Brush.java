package state;

public class Brush implements ToolType{
    @Override
    public void mouseDown() {
        System.out.println("Brush icon...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a line...");
    }
}
