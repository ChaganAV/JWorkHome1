public class Door {
    private Boolean state;
    public Door(Boolean lock){
        this.state =lock;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format(getState().toString());
    }
}
