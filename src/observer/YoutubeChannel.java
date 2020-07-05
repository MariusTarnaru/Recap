package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private String channelName;
    private String state;
    List<Observer> observerList;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
        observerList = new ArrayList<>();
    }

    public YoutubeChannel() {
        observerList = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        observerList.forEach(o -> o.notify(state));
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObservers();
    }

    public String getChannelName() {
        return channelName;
    }
}
