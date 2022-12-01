import java.awt.*;

public class Board {
    static boolean inverse = true;
    public static void setBoardColor(Graphics g) {
        if (!inverse) {
            g.setColor(new Color(119, 149, 87));
        } else {
            g.setColor(new Color(236, 236, 208));
        }
    }
    public static void draw(Graphics g) {
        inverse = true;
        for (int y = 0; y < 8; y++) {
            inverse = !inverse;
            for (int x = 0; x < 8; x++) {
                inverse = !inverse;
                setBoardColor(g);
                g.fillRect(
                        x * RenderOptions.scale,
                        y * RenderOptions.scale,
                        RenderOptions.scale,
                        RenderOptions.scale
                );
            }
        }
    }
    public static void render(Graphics g) {
        //Board.draw(g);
        Piece piece = new Piece(new Color(255, 255, 255));
        piece.drawPiece(g, PieceType.PAWN, 10, 10);
    }
}
