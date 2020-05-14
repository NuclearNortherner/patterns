package in.blagush.learn.patterns.command.nolambdas.commands;

import in.blagush.learn.patterns.command.nolambdas.entities.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
