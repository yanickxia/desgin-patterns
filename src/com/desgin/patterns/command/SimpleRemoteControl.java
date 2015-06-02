package com.desgin.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class SimpleRemoteControl {

    List<Command> slots = new ArrayList<>();

    public void addComment(Command command) {
        slots.add(command);
    }

    public void buttonWasPressed() {
        for (Command command : slots) {
            command.execute();
        }
    }
}
