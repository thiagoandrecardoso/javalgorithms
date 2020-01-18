package math;

import org.junit.jupiter.api.Test;

import static math.SteinerPizza.maximumNumberOfPieces;
import static org.junit.jupiter.api.Assertions.*;

class SteinerPizzaTest {

    @Test
    public void zeroCutsAbdOnePiece() {
        assertEquals(1, maximumNumberOfPieces(0));
    }

    @Test
    public void oneCutsAndTwoPieces() {
        assertEquals(2, maximumNumberOfPieces(1));
    }

    @Test
    public void twoCutsAndFourPieces() {
        assertEquals(4, maximumNumberOfPieces(2));
    }

    @Test
    public void threeCutsAndSevenPieces() {
        assertEquals(7, maximumNumberOfPieces(3));
    }

    @Test
    public void fourCutsAndElevenPieces() {
        assertEquals(11, maximumNumberOfPieces(4));
    }

}