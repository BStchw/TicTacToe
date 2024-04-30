import org.example.Board;
import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testInitialBoard() {
        Board board = new Board();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals('_', board.getCellSign(i, j));
            }
        }
    }

    @Test
    public void testSetO() {
        Board board = new Board();

        board.setO(1, 1);

        assertEquals('O', board.getCellSign(1, 1));
    }

    @Test
    public void testSetX() {
        Board board = new Board();

        board.setX(0, 0);

        assertEquals('X', board.getCellSign(0, 0));
    }

    @Test
    public void testIsPlayerWon() {
        Board board = new Board();

        board.setX(0, 0);
        board.setX(0, 1);
        board.setX(0, 2);

        assertTrue(board.isPlayerWon('X'));
    }

    @Test
    public void testIsDraw() {
        Board board = new Board();

        board.setX(0, 0);
        board.setO(0, 1);
        board.setX(0, 2);
        board.setO(1, 0);
        board.setX(1, 1);
        board.setO(1, 2);
        board.setO(2, 0);
        board.setX(2, 1);
        board.setO(2, 2);

        assertTrue(board.isDraw());
    }
}
