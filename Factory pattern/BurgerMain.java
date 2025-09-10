public class BurgerMain
{
    public static void main(String[] args) 
    {
        Burgerfactory factory=new SingBurger();
        Burger burger=factory.createBurger("Basic");
        burger.prepare();
        Burgerfactory factory1=new KingBurger();
        Burger burger1=factory1.createBurger("PremiumWheat");
        burger1.prepare();

    }
}