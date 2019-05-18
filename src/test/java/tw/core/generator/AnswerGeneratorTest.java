package tw.core.generator;

import org.junit.Test;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {
    @Test
    public void should_generate_answer_1() throws OutOfRangeAnswerException {
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        Answer exceptedAnswer = answerGenerator.generate();
        assertThat(answer.toString().length(),is(exceptedAnswer.toString().length()));
    }

    @Test
    public void should_generate_answer_2() throws OutOfRangeAnswerException{
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        AnswerGenerator answerGenerator = new AnswerGenerator(randomIntGenerator);
        Answer exceptedAnswer = answerGenerator.generate();
        boolean isGenerator = Arrays.stream(exceptedAnswer.toString().split(" "))
                .map(num -> parseInt(num))
                .distinct()
                .filter(num -> num < 10).count() == 4;
        assertThat(isGenerator,is(true));
    }
}

