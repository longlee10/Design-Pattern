package state;

public class Canvas {
    private ToolType tool;

    public void mouseDown(){
        tool.mouseDown();
    }

    public void mouseUp(){
        tool.mouseUp();
    }

    public void setTool(ToolType tool) {
        this.tool = tool;
    }
}
