package in.blagush.learn.patterns.command.nolambdas;

import in.blagush.learn.patterns.command.nolambdas.commands.Command;
import in.blagush.learn.patterns.command.nolambdas.commands.NoCommand;

import java.util.Arrays;

public class SimpleRemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private int slots;

    public SimpleRemoteControl(int slots) {
        this.slots = slots;
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slots; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimpleRemoteControl{");
        sb.append("onCommands=").append(Arrays.toString(onCommands));
        sb.append(", offCommands=").append(Arrays.toString(offCommands));
        sb.append('}');
        return sb.toString();
    }
}
