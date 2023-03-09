public class Wardrobe extends Dresser implements IClosed{
    public Wardrobe(Door[] door, Box[] box) {
        super(door, box);
    }

    public Wardrobe(Door[] door) {
        super(door);
    }

    public Wardrobe(Box[] box) {
        super(box);
    }

    @Override
    public void setLocked(Boolean lock) {
        setLock(lock);
    }

    @Override
    public Boolean getLocked() {
        return null;
    }
}

