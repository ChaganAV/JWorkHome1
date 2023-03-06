package org.models.house;

public class Door {
    private String name;
    public Door(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(this.name);
    }
}
