package com.desgin.patterns.command;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class VoicePlayCommand implements Command {

    Voice voice;

    @Override
    public void execute() {
        voice.on();
    }

    public VoicePlayCommand(Voice voice) {
        this.voice = voice;
    }
}
