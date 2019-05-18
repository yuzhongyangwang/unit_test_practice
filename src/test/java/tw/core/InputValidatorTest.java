package tw.core;

import org.junit.Test;
import tw.validator.InputValidator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    @Test
    public void should_return_true_for_input(){
        InputValidator inputValidator = new InputValidator();
        boolean flag = inputValidator.validate("1 3 5 8");
        assertThat(flag,is(true));
    }

    @Test
    public void should_return_false_for_input(){
        InputValidator inputValidator = new InputValidator();
        boolean flag = inputValidator.validate("1 3 5 12");
        assertThat(flag,is(false));
    }
}
