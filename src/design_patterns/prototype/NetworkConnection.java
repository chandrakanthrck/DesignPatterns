package design_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

//Indicating that this is valid to be cloned
public class NetworkConnection implements Cloneable{
    private String ip;
    private String importantData;
    //to understand deep copy
    private List<String> domains = new ArrayList<>();

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
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
        //takes about 5 mins
        this.importantData = "Very very important data.";
        domains.add("www.example1.com");
        domains.add("www.example2.com");
        domains.add("www.example3.com");
        domains.add("www.example4.com");
        Thread.sleep(5000);
    }

    @Override
    public Object clone() {
        //logic for cloning
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setIp(this.getImportantData());
        for(String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}
