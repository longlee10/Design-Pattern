package state;

public class Eraser implements ToolType{
    @Override
    public void mouseDown() {
        System.out.println("Eraser icon...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing...");
    }
}
