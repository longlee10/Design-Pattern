package control;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void turnOn(){
        for(var command : commands)
            command.turnOn();
    }

    public void turnOff(){
        for(var command : commands)
            command.turnOff();
    }
}
