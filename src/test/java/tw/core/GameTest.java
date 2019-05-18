package tw.core;

import org.junit.Test;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.generator.AnswerGenerator;
import tw.core.generator.RandomIntGenerator;
import tw.core.model.GuessResult;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    @Test
    public void should_return_guessed_result_1() throws OutOfRangeAnswerException{
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        Game game = new Game(answerGenerator);
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("7");
        }});
        GuessResult exceptedGuessResult = game.guess(answer);
        assertThat(exceptedGuessResult.getResult().contains("A"),is(true));
    }

    @Test
    public void should_return_guessed_result_2() throws OutOfRangeAnswerException{
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        Game game = new Game(answerGenerator);
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("7");
        }});
        GuessResult exceptedGuessResult = game.guess(answer);
        assertThat(exceptedGuessResult.getResult().length(),is(4));
    }
}
