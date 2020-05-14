package in.blagush.learn.patterns.command.lambdas.commands;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("not programed");
    }

}
