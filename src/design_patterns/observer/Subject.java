package design_patterns.observer;

//think of it of an example of a YouTube Channel
public interface Subject {
    void subscribe(Observer ob);
    void unsubscribe(Observer ib);
    void newVideoUploaded(String title);
}
