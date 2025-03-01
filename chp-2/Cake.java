//nesting method

public class Cake {

    public void mixIngredients() {
        System.out.println("Mixing ingredients...");
    }

    public void putInOven() {
        System.out.println("Putting cake in the oven...");
    }

    public void bakeCake() {  // Method that nests other methods
        mixIngredients();  
        putInOven();     
        System.out.println("Cake is baked!");
    }

    public static void main(String[] args) {
        Cake myCake = new Cake();
        myCake.bakeCake();
    }
}