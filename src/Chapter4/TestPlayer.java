package Chapter4;

public class TestPlayer {
    public static void main(String[] args) {

        BaseballPlayer aCatcher = new BaseballPlayer(12, 0.218);
        BaseballPlayer aShortstop = new BaseballPlayer(31, 0.385);

        aCatcher.showPlayer();
        aShortstop.showPlayer();

        BaseballPlayer anOutfielder = new BaseballPlayer(44, 0.505);

        anOutfielder.showPlayer();
        aCatcher.showPlayer();
    }
}
