package com.desgin.patterns.command;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class Main {

    public static void main(String[] args) {

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Voice voice = new Voice();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        VoicePlayCommand voicePlayCommand = new VoicePlayCommand(voice);

        simpleRemoteControl.addComment(lightOnCommand);
        simpleRemoteControl.addComment(voicePlayCommand);

        simpleRemoteControl.buttonWasPressed();

    }
}
