package observer;

public class HumanUser implements Observer {
    private String state;

    @Override
    public void notify(String state) {
        this.state = state;
    }

    @Override
    public void subscribe(YoutubeChannel youtubeChannel) {
        System.out.println("You have been subscribed to " + youtubeChannel.getChannelName());
        youtubeChannel.addObserver(this);
    }

    @Override
    public void unsubscribe(YoutubeChannel youtubeChannel) {
        System.out.println("You have unsubscribed from " + youtubeChannel.getChannelName());
        youtubeChannel.removeObserver(this);
    }

    @Override
    public String getState() {
        return this.state;
    }
}
