package Rock_Paper_Scissors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GameLogicTest {

    private final GameLogic logic = new GameLogic();

    @ParameterizedTest
    @CsvSource({
        "0,0,Match Draw",
        "1,1,Match Draw",
        "2,2,Match Draw"
    })
    void testDraw(int userInput,int compInput,String expected) {
        assertEquals(expected,logic.gameLogic(userInput, compInput));
    }
    @ParameterizedTest
    @CsvSource({
        "0,2,You Win with score 1",
        "1,0,You Win with score 1",
        "2,1,You Win with score 1"
    })
    void youWin(int userInput, int compInput, String expected) {
        assertEquals(expected,
                logic.gameLogic(userInput, compInput));
    }
    @ParameterizedTest
    @CsvSource({
        "0,1,You Lose\n\n System won with score 1",
        "1,2,You Lose\n\n System won with score 1",
        "2,0,You Lose\n\n System won with score 1"
    })
    void SystemWin(int userInput,int compInput,String expected) {
        assertEquals(expected,logic.gameLogic(userInput, compInput));
    }
    
}