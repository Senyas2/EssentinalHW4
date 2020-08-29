package Task2;

public class Player implements Playable, Recodable {
    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void rec() {

    }

    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.rec();
        player.stop();
    }
}
