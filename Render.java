import java.applet.Applet;
import java.awt.*;

public class Render extends Applet {
    public static int minMaxRandom(int min, int max) {
        int range = max - min + 1;
        return (int)(Math.floor(Math.random() * range) + min);
    }
    static String formatTime(int num) {
        return (num < 10) ? "0" + num : Integer.toString(num);
    }
    public void paint(Graphics g) {
        Board.render(g, true);
        String[] playerTimes = new String[]{
                formatTime(minMaxRandom(1, 20)) + ":" + formatTime(minMaxRandom(0, 59)),
                formatTime(minMaxRandom(1, 20)) + ":" + formatTime(minMaxRandom(0, 59))
        };
        for (int i = 1; i <= 2; i++) {
            Clock clock = new Clock(g, i, playerTimes[i - 1]);
            clock.drawBase();
            clock.drawTime();
        }
    }
}
