public class Main {
    public static void main(String[] args) {
        Wardrobe drobe = new Wardrobe();
        drobe.setState(true);
        if (drobe.getState())
            System.out.println(drobe.toString()+" открыт");
        else
            System.out.println(drobe.toString()+" закрыт");

        System.out.println(drobe.toString());
    }
}