package design_patterns.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber john = new Subscriber("John");
        Subscriber doe = new Subscriber("Doe");
        Subscriber jake = new Subscriber("Jake");
        channel.subscribe(john);
        channel.subscribe(doe);
        channel.subscribe(jake);
        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("Learn Microservices");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 to upload video.");
            System.out.println("Press 2 to create new subscriber.");
            System.out.println("Press 3 to exit.");
            int c = Integer.parseInt(br.readLine());
            if(c == 1){
                System.out.println("Enter video title: ");
                String videoTitle = br.readLine();
                channel.newVideoUploaded(videoTitle);

            }else if(c == 2){
                System.out.println("Enter the name of the subscriber: ");
                String subsName = br.readLine();
                Subscriber subscriber3 = new Subscriber(subsName);
                channel.subscribe(subscriber3);
            }else if(c == 3){
                System.out.println("Thank you for using the app");
                break;
            }else{
                System.out.println("Wrong Input");
            }
        }
    }
}
