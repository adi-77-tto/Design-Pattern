 public class abstractFactoryMain {
    public static void main(String[] args) {
    mealFactory factory = new ConcreteBurgerFactory();  
    Tea tea = factory.createTea("green");  
    Burger burger = factory.createBurger("beef");  
    tea.prepare();  
    burger.cook();  
}
}