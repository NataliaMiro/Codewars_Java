package org.example;

public class PlayingWithCube {
    /*
    Playing with cubes I
    Create a public class called Cube without a constructor
     which gets one single private integer variable Side,
      a getter GetSide() and a setter SetSide(int num) method
      for this property.Playing with cubes I
    Create a public class called Cube without a constructor
     which gets one single private integer variable Side,
      a getter GetSide() and a setter SetSide(int num) method
      for this property.

     */

   private int side;

    public int getSide( ) {
        return side;
    }

    public void setSide(int newSide) {
        this.side = newSide;
    }

    static void main() {
        PlayingWithCube playingWithCube = new PlayingWithCube();
        playingWithCube.setSide(5);
        int a = playingWithCube.getSide();

        System.out.println(a);
    }

}
