package design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscribers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscribers.remove(ob);
    }

    @Override
    public void newVideoUploaded() {
        for(Observer ob : this.subscribers){
            ob.notified();
        }

    }
}
