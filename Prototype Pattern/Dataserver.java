public class Dataserver implements Cloneable {
    private String ip;
    private String networkData;
    public String getIp() {
        return ip;
    }
    public String getNetworkData() {
        return networkData;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public void setNetworkData(String networkData) throws InterruptedException {
        this.networkData = networkData;
        Thread.sleep(5000);
        
    }

    public String toString() {
        return "Dataserver [ip=" + ip + ", networkData=" + networkData + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

    
