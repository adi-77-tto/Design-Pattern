public abstract class Burger {
    public abstract void cook();
}
class BeefBurger extends Burger {
    @Override
    public void cook() {
        System.out.println("Cooking a beef burger.");
    }
}
class ChickenBurger extends Burger {
    @Override
    public void cook() {
        System.out.println("Cooking a chicken burger.");
    }
}
