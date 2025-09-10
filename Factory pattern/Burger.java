public abstract class Burger
{
 public abstract void prepare();
}
class BasicBurger extends Burger
{
    public void prepare()
    {
        System.out.println("-> Preparing Basic Burger with bun,patty and ketchup!");
    }
}
class StandardBurger extends Burger
{
    public void prepare()
    {
        System.out.println("-> Preparing Standard Burger with bun,patty,chees and lettuce!");
    }
}
    class PremiumBurger extends Burger
{
    public void prepare()
    {
        System.out.println("-> Preparing Premium Burger with bun,patty,chees,lettuce and secret sauce!");
    }
}
class BasicWheatBurger extends Burger
{
   public void prepare()
    {   
        System.out.println("-> Preparing Basic Wheat Burger with bun,patty and ketchup");
    }
}
class StandardWheatBurger extends Burger
{
    public void prepare()
    {
        System.out.println("-> Preparing Standard wheat Burger with bun,patty,chees and lettuce!");
    }
}
    class PremiumWheatBurger extends Burger
{
   public void prepare()
    {
        System.out.println("-> Preparing Premium wheat Burger with bun,patty,chees,lettuce and secret sauce!");
    }
}