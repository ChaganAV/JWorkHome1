public abstract class Box{
    private Boolean lock;
    public Box(Boolean lock){
        this.lock = lock;
    }

    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return String.format(this.lock.toString());
    }
}
