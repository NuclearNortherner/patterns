package in.blagush.learn.patterns.command.lambdas;

import in.blagush.learn.patterns.command.lambdas.commands.Command;
import in.blagush.learn.patterns.command.lambdas.entities.Light;
import in.blagush.learn.patterns.command.lambdas.entities.Stereo;

public class Runner {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(4);

        Light light = new Light();

        remote.setCommand(0, light::on, light::off);

        remote.onButtonPressed(0);

        Stereo stereo = new Stereo();
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };

        remote.setCommand(1, stereoOnWithCD, stereo::off);

        remote.onButtonPressed(1);
        remote.offButtonPressed(1);
    }
}
