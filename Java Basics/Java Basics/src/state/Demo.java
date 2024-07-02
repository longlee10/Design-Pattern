package state;

public class Demo {
    public static void main(String[] args) {
        var canvas = new Canvas();

        canvas.setTool(new Brush());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setTool(new Eraser());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
