package observer;

public interface Observer {
    void notify(String state);
    void subscribe(YoutubeChannel youtubeChannel);
    void unsubscribe(YoutubeChannel youtubeChannel);
    String getState();
}
