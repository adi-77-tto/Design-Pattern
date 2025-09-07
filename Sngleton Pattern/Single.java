public class Single {
    private static volatile Single instance;
    private String data;

    private Single(String data) {
        this.data = data;
    }

    public static Single getInstance(String data) {
        Single result = instance;
        if (result == null) 
        {
            synchronized (Single.class) 
            {
                if (result == null) {
                    instance = result = new Single(data);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Single[data=" + data + "]";
    }
    public static void main(String[] args) {
        Single s1 = Single.getInstance("First Instance");
        System.out.println("Singleton instance: " + s1);

        Single s2 = Single.getInstance("Second Try");
        System.out.println("Singleton instance: " + s2);

        System.out.println("Are both same? " + (s1 == s2));
    }
}
