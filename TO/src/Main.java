public class Main {

    public static void main(String[] args) {
        Cocktail c = Menu.getMojito();
        System.out.println(c);
        System.out.println(c.getAlcohol());
        System.out.println(c.getLiquidVolume());
        System.out.println(c.getVolume());
        System.out.println(c.getSolidCounter());
        System.out.println(c.getLiquidCounter());

    }
}
