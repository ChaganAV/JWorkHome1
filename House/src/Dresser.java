public abstract class Dresser{
    private Door door;

    public Dresser(Boolean lock) {
        this.door = new Door(lock);
    }

    public Boolean getState() {
        return door.getState();
    }

    public void setState(Boolean lock) {
        this.door.setState(lock);
    }

    @Override
    public String toString() {
        return String.format("Шкаф");
    }
}
