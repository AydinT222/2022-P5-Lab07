import java.awt.*;

public class Board {
    static boolean inverse = true;
    public static void setBoardColor(Graphics g) {
        g.setColor(
                (inverse) ? new Color(236, 236, 208) : new Color(119, 149, 87)
        );
    }
    public static void draw(Graphics g, int x, int y) {
        int scale = 82;
        setBoardColor(g);
        g.fillRect(
                x * scale,
                y * scale,
                scale,
                scale
        );
    }
    public static void gridLoop(Graphics g) {
        inverse = true;
        for (int y = 0; y < 8; y++) {
            inverse = !inverse;
            for (int x = 0; x < 8; x++) {
                inverse = !inverse;
                Board.draw(g, x, y);
            }
        }
    }

    public static void render(Graphics g, boolean randomlyPlaced) {
        Board.gridLoop(g);
        if (randomlyPlaced) {
            for (int y = 0; y < 8; y++) {
                for (int x = 0; x < 8; x++) {
                    if (Render.minMaxRandom(1, 4) == 1) { // determine if place based on 25% chance
                        int player = Render.minMaxRandom(1, 2); // determines the player

                        // it wouldn't make sense if a pawn was on the opposite side and not promoted
                        if (y == 0 && player == 2) {
                            player = 1;
                        } else if (y == 7 && player == 1) {
                            player = 2;
                        }

                        Piece piece = new Piece(g, Piece.getColor(player));
                        piece.drawPiece(x, y);
                    }
                }
            }
        } else {
            for (int y = 0; y < 2; y++) {
                Piece piece = new Piece(g, Piece.getColor(1));
                for (int x = 0; x < 8; x++) {
                    piece.drawPiece(x, y);
                }
            }
            for (int y = 0; y < 2; y++) {
                Piece piece = new Piece(g, Piece.getColor(2));
                for (int x = 0; x < 8; x++) {
                    piece.drawPiece(x, y + 6);
                }
            }
        }
    }
}
