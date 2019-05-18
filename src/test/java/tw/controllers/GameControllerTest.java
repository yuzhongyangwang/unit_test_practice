package tw.controllers;

import org.junit.Test;
import tw.commands.GuessInputCommand;
import tw.commands.InputCommand;

import java.io.IOException;

import static org.mockito.Mockito.*;

/**
 * 在GameControllerTest文件中完成GameController中对应的单元测试
 */
public class GameControllerTest {
    @Test
    public void should_begin_game() throws IOException{
        GameController gameController = mock(GameController.class);
        gameController.beginGame();
        verify(gameController,times(1)).beginGame();
    }

    @Test
    public void should_play() throws IOException{
        GameController gameController = mock(GameController.class);
        InputCommand command = new GuessInputCommand();
        gameController.play(command);
        verify(gameController,times(1)).play(command);
    }
}