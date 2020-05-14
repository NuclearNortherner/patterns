package in.blagush.learn.patterns.command.nolambdas.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("not programed");
    }

    @Override
    public void undo() {

    }
}
