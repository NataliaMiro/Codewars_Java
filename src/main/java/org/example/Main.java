package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
         PlayingWithCube playingWithCube = new PlayingWithCube();
         playingWithCube.setSide(5);
         int a = playingWithCube.getSide();

        System.out.println(a);
    }
}
