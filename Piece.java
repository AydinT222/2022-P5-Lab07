import java.awt.*;

public class Piece {
    Color color;
    public Piece(Color new_color) {
        color = new_color;
    };

    public void drawPiece(Graphics g, PieceType type, int x, int y) {

        g.setColor(Color.BLACK);
        g.fillOval(30, 505, 22, 22);
        Polygon poly = new Polygon();

        poly.addPoint(30, 505);
        poly.addPoint(100, 600);
        poly.addPoint(100, 650);

        //g.fillPolygon(poly);
    }

}