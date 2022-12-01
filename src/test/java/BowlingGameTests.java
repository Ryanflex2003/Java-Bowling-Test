import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTests {
    private Game game;

    @BeforeEach
    void BeforeEach(){
        game = new Game();
    }

    @Test
    void TestOneStrike() {
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(4,5));
        Assertions.assertEquals(28, game.GetScore());
    }

    @Test
    void TestOneSpare(){
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(7,2));
        Assertions.assertEquals(26, game.GetScore());
    }

    @Test
    void TestOneSpareStrikeCombo(){
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(7,2));
        Assertions.assertEquals(48, game.GetScore());
    }

    @Test
    void TestGame(){
        game.Bowl(new Frame(1,3));
        game.Bowl(new Frame(7,3));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(1,7));
        game.Bowl(new Frame(5,2));
        game.Bowl(new Frame(5,3));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(9,0));
        Assertions.assertEquals(131, game.GetScore());
    }

    @Test
    void TestGameWithSpareInTheTenth(){
        game.Bowl(new Frame(1,3));
        game.Bowl(new Frame(7,3));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(1,7));
        game.Bowl(new Frame(5,2));
        game.Bowl(new Frame(5,3));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(9,1,10));
        Assertions.assertEquals(143, game.GetScore());
    }

    @Test
    void TestGameWithStrikesInTheTenth(){
        game.Bowl(new Frame(1,3));
        game.Bowl(new Frame(7,3));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(1,7));
        game.Bowl(new Frame(5,2));
        game.Bowl(new Frame(5,3));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(8,2));
        game.Bowl(new Frame(10));
        game.Bowl(new Frame(10,10,10));
        Assertions.assertEquals(163, game.GetScore());
    }
}
