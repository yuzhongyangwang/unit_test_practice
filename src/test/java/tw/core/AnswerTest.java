package tw.core;

import org.junit.Test;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    @Test
    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() throws Exception {
        String inputStr = "1 2 3 4";
        Answer answer = new Answer();
        Answer answerStr = answer.createAnswer(inputStr);

    }
}