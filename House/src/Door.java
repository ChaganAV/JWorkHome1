public class Door extends Box{
    public Door(Boolean lock){
        super(lock);
    }

    @Override
    public String toString() {
        return String.format(getLock().toString());
    }
}
