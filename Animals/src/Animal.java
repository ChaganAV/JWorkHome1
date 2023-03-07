public abstract class Animal {
    private String genus;

    public Animal(String genus){
        this.genus = genus;
    }
    public Animal(){
    }

    @Override
    public String toString() {
        return this.genus;
    }
}
