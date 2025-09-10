public abstract class Burgerfactory
{
    public abstract Burger createBurger(String type);
}
class SingBurger extends Burgerfactory
    {
        public Burger createBurger(String type){
        if(type.equals("Basic")) return new BasicBurger();
        if(type.equals("Standard")) return new StandardBurger();
        if(type.equals("Premium")) return new PremiumBurger();
        else return null;
        }
    }
class KingBurger extends Burgerfactory
   {
        public Burger createBurger(String type){
        if(type.equals("BasicWheat")) return new BasicWheatBurger();
        if(type.equals("StandardWheat")) return new StandardWheatBurger();
        if(type.equals("PremiumWheat")) return new PremiumWheatBurger();
        else return null;
        }
    }
