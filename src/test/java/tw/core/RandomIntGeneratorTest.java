package tw.core;


import org.junit.Test;
import tw.core.generator.RandomIntGenerator;

import static org.mockito.Mockito.*;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {

    @Test
    public void should_generate_randomInt_Nums(){
        RandomIntGenerator randomIntGenerator = mock(RandomIntGenerator.class);
        randomIntGenerator.generateNums(9,4);
        verify(randomIntGenerator,times(1)).generateNums(9,4);
    }
}