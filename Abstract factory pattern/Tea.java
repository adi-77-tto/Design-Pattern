public abstract class Tea{
    public abstract void prepare();
}
class GreenTea extends Tea {
    @Override
    public void prepare() {
        System.out.println("Preparing green tea.");
    }
}
class BlackTea extends Tea {
    @Override
    public void prepare() {
        System.out.println("Preparing black tea.");
    }
}
