public class Menu {


    static public Cocktail getMojito(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),100,40,"vodka",State.LIQUID),200,0,"sprite",State.LIQUID),50,0,"ice",State.SOLID),10,0,"mint",State.SOLID);
    }

    static public Cocktail getSexOnTheBeach(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),100,40,"vodka",State.LIQUID),200,0,"orange juice",State.LIQUID),50,0,"mango juice",State.LIQUID),10,0,"fresh orange",State.SOLID);
    }

    static public Cocktail getDykta(){
        return new Ingredient(new PlainCocktail(),1000,998,"Denaturat",State.LIQUID);
    }

    static public Cocktail getPinacolada(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),100,40,"rum",State.LIQUID),200,0,"cola",State.LIQUID),50,0,"ice",State.SOLID),200,0,"pineapple juice",State.LIQUID);
    }

    static public Cocktail getMadDog(){
        return new Ingredient(new Ingredient(new PlainCocktail(),100,40,"vodka",State.LIQUID),10,0,"tabasco",State.LIQUID);
    }
    static public Cocktail getApplePie(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),100,10,"apple cider",State.LIQUID),100,0,"apple juice",State.LIQUID),5,0,"brown sugar",State.SOLID),2,0,"cinamon",State.SOLID);
    }

    static public Cocktail getTsunami(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),100,40,"schnapps",State.LIQUID),100,40,"blue curacao",State.LIQUID),50,0,"ice",State.SOLID),10,0,"cherry",State.SOLID);
    }

    static public Cocktail getPanoramixCauldron(){
        return new Ingredient(new Ingredient(new Ingredient(new Ingredient(new PlainCocktail(),1000,400,"vodka",State.LIQUID),1000,50,"Harnas beer",State.LIQUID),1000,120,"sangria vine",State.LIQUID),10,0,"mint",State.SOLID);
    }
}


