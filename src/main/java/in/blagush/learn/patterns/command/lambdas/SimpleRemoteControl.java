package in.blagush.learn.patterns.command.lambdas;

import in.blagush.learn.patterns.command.lambdas.commands.Command;

import java.util.Arrays;

public class SimpleRemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private int slots;

    public SimpleRemoteControl(int slots) {
        this.slots = slots;
        onCommands = new Command[slots];
        offCommands = new Command[slots];

        for (int i = 0; i < slots; i++) {
            onCommands[i] = () -> {};
            offCommands[i] = () -> {};
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        offCommands[slot].execute();
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
