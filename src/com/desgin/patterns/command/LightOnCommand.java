package com.desgin.patterns.command;

/**
 * Created by Yann.Xia on 2015/6/2.
 */
public class LightOnCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.on();
    }

    public  LightOnCommand(Light light){
        this.light = light;
    }
}
