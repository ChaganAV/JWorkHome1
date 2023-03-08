public abstract class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }
    public Human(){
        this.name = "Неизвестный";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract String toString();
}
