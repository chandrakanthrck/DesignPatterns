package design_patterns.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.168.4.2");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);

        // Clone without calling loadVeryImportantData again
        NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection1);

        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        networkConnection.getDomains().remove(0);  // Manipulate original list
        System.out.println(networkConnection2);

        NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection3);
    }
}
