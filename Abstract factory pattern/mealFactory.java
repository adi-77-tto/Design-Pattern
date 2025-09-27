public abstract class mealFactory {
    public abstract Burger createBurger(String type);
    public abstract Tea createTea(String type);
}
class ConcreteBurgerFactory extends mealFactory {
    @Override
    public Burger createBurger(String type) {
        if (type.equals("beef")) {
            return new BeefBurger();
        }
        return null;
    }
    public Tea createTea(String type) {
        if (type.equals("green")) {
            return new GreenTea();
        }
        return null;
    }
}
class kingBurgerFactory extends mealFactory {
    @Override
    public Burger createBurger(String type) {
        if (type.equals("chicken")) {
            return new ChickenBurger();
        }
        return null;
    }
    public Tea createTea(String type) {
        if (type.equals("black")) {
            return new BlackTea();
        }
        return null;
    }
}