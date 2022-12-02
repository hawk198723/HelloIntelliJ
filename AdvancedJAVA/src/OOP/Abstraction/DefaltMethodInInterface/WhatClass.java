package OOP.Abstraction.DefaltMethodInInterface;

public class WhatClass implements What{
    public void show(){
        System.out.println("show what?");
    }

    @Override
    public void play() {
        System.out.println("let's play something else!!");
    }
}
