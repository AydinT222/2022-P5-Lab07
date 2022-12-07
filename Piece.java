import java.awt.*;

public class Piece {
    Color color;
    Graphics g;
    public Piece(Graphics new_g, Color new_color) {
        g = new_g;
        color = new_color;
    };

    public static Color getColor(int player) {
        return (player == 1) ? new Color(88, 84, 81) : new Color(249, 249, 249);
    }
    public void drawPiece(int x, int y) {
        g.setColor(color);
        /*g.fillOval(x * 30, y * 505, 22, 22);
        Polygon polyTop = new Polygon();
        polyTop.addPoint(x * 27, y * 532);
        polyTop.addPoint(x * 53, y * 532);
        polyTop.addPoint(x * 40, y * 510);
        g.fillPolygon(polyTop);
        Polygon polyMid = new Polygon();
        polyMid.addPoint(x * 34, y * 532);
        polyMid.addPoint(x * 47, y * 532);
        polyMid.addPoint(x * 48, y * 540);
        polyMid.addPoint(x * 33, y * 540);
        g.fillPolygon(polyMid);
        Polygon polyBot = new Polygon();
        polyBot.addPoint(x * 33, y * 540);
        polyBot.addPoint(x * 20, y * 552);
        polyBot.addPoint(x * 20,  y * 560);
        polyBot.addPoint(x * 62,  y * 560);
        polyBot.addPoint(x * 62, y * 552);
        polyBot.addPoint(x * 48, y * 540);
        g.fillPolygon(polyBot);*/
        int offsetX = x * 82;
        int offsetY = y * 82;
        g.fillOval(offsetX + 31, offsetY + 19, 22, 22);
        Polygon polyTop = new Polygon();
        polyTop.addPoint(offsetX + 28, offsetY + 46);
        polyTop.addPoint(offsetX + 54, offsetY + 46);
        polyTop.addPoint(offsetX + 41, offsetY + 24);
        g.fillPolygon(polyTop);
        Polygon polyMid = new Polygon();
        polyMid.addPoint(offsetX + 35, offsetY + 46);
        polyMid.addPoint(offsetX + 48, offsetY + 46);
        polyMid.addPoint(offsetX + 49, offsetY + 54);
        polyMid.addPoint(offsetX + 34, offsetY + 54);
        g.fillPolygon(polyMid);
        Polygon polyBot = new Polygon();
        polyBot.addPoint(offsetX + 34, offsetY + 54);
        polyBot.addPoint(offsetX + 21, offsetY + 66);
        polyBot.addPoint(offsetX + 21,  offsetY + 74);
        polyBot.addPoint(offsetX + 63,  offsetY + 74);
        polyBot.addPoint(offsetX + 63, offsetY + 66);
        polyBot.addPoint(offsetX + 49, offsetY + 54);
        g.fillPolygon(polyBot);
    }
}