public abstract class Dresser extends Box{
    private Door[] door;
    private Box[] box;

    public Dresser(Door[] door, Box[] box) {
        super(false);
        this.door = door;
        this.box = box;
    }

    public Dresser(Door[] door) {
        super(false);
        this.door = door;
        this.box = null;
    }
    public Dresser(Box[] box) {
        super(false);
        this.door = null;
        this.box = box;
    }
    public Door[] getDoor() {
        return door;
    }

    public void setDoor(Door[] door) {
        this.door = door;
    }

    public Box[] getBox() {
        return box;
    }

    public void setBox(Box[] box) {
        this.box = box;
    }
}
