import java.awt.*;

public class Clock {
    int player;
    Graphics g;
    String timeString;
    public Clock(Graphics new_g, int new_player, String time) {
        g = new_g;
        player = new_player;
        timeString = time;
    }
    public int getPositionY() {
        return (player == 1) ? 5 : 595;
    }
    public void drawBase() {
        g.setColor(new Color(87, 87, 87));
        g.fillRect(700, getPositionY(), 200, 50);
    }
    public void drawTime() {
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 50));
        g.drawString(timeString, 735, getPositionY() + 43);
    }
}
