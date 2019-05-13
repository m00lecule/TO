public class Ingredient extends CocktailDecorator {
    private int volume;
    private String name;
    private int alcohol;
    private State state;


    public Ingredient(Cocktail c, int v,int a, String n , State s ){
        super(c);
        volume = v;
        alcohol = a;
        name =n;
        state = s;
    }

    @Override
    public int getLiquidVolume() {
        return super.getLiquidVolume() + (state == State.LIQUID ? volume : 0);
    }

    @Override
    public int getVolume() {
        return super.getVolume() + volume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + name ;
    }

    @Override
    public int getAlcohol() {
        return super.getAlcohol() + alcohol;
    }

    @Override
    public int getLiquidCounter() {
        return super.getLiquidCounter() + (state == State.LIQUID ? 1 : 0);
    }


    @Override
    public int getSolidCounter() {
        return super.getSolidCounter() + (state == State.SOLID ? 1 : 0);
    }



}
