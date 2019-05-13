abstract class CocktailDecorator implements Cocktail {
    protected Cocktail cocktail;

    public CocktailDecorator(Cocktail c){
        cocktail=c;
    }

    @Override
    public int getAlcohol() {
        return cocktail.getAlcohol();
    }

    @Override
    public int getVolume() {
        return cocktail.getVolume();
    }

    @Override
    public int getLiquidVolume() {
        return cocktail.getLiquidVolume();
    }

    @Override
    public int getLiquidCounter() {
        return cocktail.getLiquidCounter();
    }

    @Override
    public int getSolidCounter() {
        return cocktail.getSolidCounter();
    }


    @Override
    public String toString(){
        return cocktail.toString();
    }
}
