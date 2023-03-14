public abstract class Animal {
    private String genus;
    private int weight;

    public Animal(String genus, int weight) {
        this.genus = genus;
        this.weight = weight;
    }
    public Animal(int weight) {
        this.weight = weight;
    }
    public Animal(String genus){
        this();
        this.genus = genus;
    }
    public Animal(){
        this.genus = "Неизвестный";
        this.weight = 0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    public String toString() {
        return this.genus;
    }
}
