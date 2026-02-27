package org.example;

/*
Building blocks
The constructor should take an array as an argument,
this will contain 3 integers of the form
[width, length, height] from which the Block should be created.
getWidth()`возвращает ширину `блока`

`getLength()` возвращает длину `блока`

`getHeight()` возвращает высоту `блока`

`getVolume()` возвращает объем `блока`

`getSurfaceArea()` возвращает площадь поверхности `Блока`
 */

public class BuildingBlock {
    private int width;
    private int length;
    private int height;

    private int[] dimensions;

//    public BuildingBlock(int width, int length, int height){
//        this.width = width;
//        this.length = length;
//        this.height = height;
//    }


    public BuildingBlock(int[] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];

    }


    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return width * length * height;
    }

    public int getSurfaceArea(){
        return (2 * (width * length + width * height + length * height));
    }

    static void main() {

        int[] dimensions = {3, 5, 7};


        BuildingBlock myBlock = new BuildingBlock(dimensions);


        System.out.println("Мой блок:");
        System.out.println("  Ширина: " + myBlock.getWidth());
        System.out.println("  Длина: " + myBlock.getLength());
        System.out.println("  Высота: " + myBlock.getHeight());
        System.out.println("  Объем: " + myBlock.getVolume());
        System.out.println("  Площадь поверхности: " + myBlock.getSurfaceArea());










    }
}
