package design_patterns.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Subscriber ck = new Subscriber();
        channel.subscribe(ck);
        channel.newVideoUploaded();
    }
}
