package com.ch2.soundsystem;

import org.springframework.stereotype.Component;

@Component("BeanAlies")//给Bean起名字
public class Play implements CD{
    public String title = "Play";
    public String artist = "金请夏";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
