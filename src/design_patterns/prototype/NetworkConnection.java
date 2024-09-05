package design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

//Indicating that this is valid to be cloned
public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;
    private List<String> domains = new ArrayList<>();

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public String getIp() {
        return ip;
    }

    public String getImportantData() {
        return importantData;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                " : " + this.domains +
                '}';
    }


    public void loadVeryImportantData() throws InterruptedException {
        this.importantData = "Very very important data";
        domains.add("www.google.com");
        domains.add("www.w3school.com");
        domains.add("www.blehbleh.com");
        Thread.sleep(2000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        //logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        //getting the ip and important data from already set values during the initialization
        networkConnection.setIp(this.getIp());
        networkConnection.setImportantData(this.getImportantData());
        //the data in the list of domains will get copied here,
        // so no changes will happen when we make any changes
        //in the primary initialization
        for(String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        //returning the deep copy object
        return networkConnection;
    }
}