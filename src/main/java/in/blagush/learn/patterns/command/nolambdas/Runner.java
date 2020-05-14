package in.blagush.learn.patterns.command.nolambdas;

import in.blagush.learn.patterns.command.nolambdas.commands.*;
import in.blagush.learn.patterns.command.nolambdas.entities.Fan;
import in.blagush.learn.patterns.command.nolambdas.entities.Light;
import in.blagush.learn.patterns.command.nolambdas.entities.Stereo;

public class Runner {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(4);

        Light light = new Light();
        Stereo stereo = new Stereo();
        Fan fan = new Fan();

        remote.setCommand(0, new LightOnCommand(light), new LightOffCommand(light));
        remote.setCommand(1, new StereoOnWithCDCommand(stereo), new StereoOffWithCDCommand(stereo));

        remote.onButtonPressed(0);
        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
        remote.offButtonPressed(0);
        remote.undoButtonPushed();

        remote.setCommand(2, new FanMediumCommand(fan), new FanOffCommand(fan));

        System.out.println(fan.getSpeed());
        remote.onButtonPressed(2);
        System.out.println(fan.getSpeed());
        remote.offButtonPressed(2);
        System.out.println(fan.getSpeed());
        remote.undoButtonPushed();
        System.out.println(fan.getSpeed());

        Command[] turnAllOn = {new LightOnCommand(light), new StereoOnWithCDCommand(stereo),
                new FanHighCommand(fan)};
        Command[] turnAllOff = {new LightOffCommand(light), new StereoOffWithCDCommand(stereo),
                new FanOffCommand(fan)};
        remote.setCommand(3, new MacroCommand(turnAllOn), new MacroCommand(turnAllOff));

        remote.onButtonPressed(3);
        remote.offButtonPressed(3);
        remote.undoButtonPushed();
    }
}
