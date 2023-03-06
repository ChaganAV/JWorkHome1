package org.models.house;
public class Wardrobe {
    private Door door1;
    private Door door2;
    public void openDoor(Door door){
        System.out.println(String.format("%s скрип-скрип",door));
    }
}

