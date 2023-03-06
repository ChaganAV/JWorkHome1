package org.models.animal;

public class Animal {
    private String genus;
    public Animal(String genus){
        this.genus = genus;
    }
    public Animal(){
    }
    public void speak(){
        System.out.println("ku");
    }
    @Override
    public String toString() {
        return this.genus;
    }
}
