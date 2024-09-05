package design_patterns.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype design");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.2");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        try {
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection4 = (NetworkConnection) networkConnection.clone();
            //to test shallow and deep copies
            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
            System.out.println(networkConnection4);
        } catch(CloneNotSupportedException exception){
            exception.printStackTrace();
        }
    }
}