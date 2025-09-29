public class Main {
    public static void main(String[] args) throws InterruptedException {
        Dataserver ds = new Dataserver();
        ds.setIp("192.168.1.1");
        ds.setNetworkData("Sample data");
        System.out.println(ds);
        try{
            Dataserver dsclone=(Dataserver)ds.clone();
            System.out.println(dsclone);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}