public class Wardrobe extends Dresser implements IClosed{
    private String color;

    public Wardrobe(Boolean lock, String color) {
        super(lock);
        this.color = color;
    }
    public Wardrobe(){
        super(false);
        this.color = "Серый";
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void setLocked(Boolean lock) {
        super.setState(lock);
    }

    @Override
    public Boolean getLocked() {
        return super.getState();
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" цвет %s",this.color);
    }
}

