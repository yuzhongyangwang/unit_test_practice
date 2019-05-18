package tw.core;

import org.junit.Test;
import tw.core.model.Record;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    @Test
    public void should_create_answer_with_string(){
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        Answer exceptedAnswer = Answer.createAnswer("1 3 5 8");
        assertThat(answer.toString(),is(exceptedAnswer.toString()));
    }

    @Test
    public void should_return_index_of_num(){
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        int index = 1;
        int exceptedIndex = answer.getIndexOfNum("3");
        assertThat(index,is(exceptedIndex));
    }

    @Test
    public void should_return_checked_result_record_with_4A0B(){
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        Record record = new Record();
        record.increaseCurrentNum();
        record.increaseCurrentNum();
        record.increaseCurrentNum();
        record.increaseCurrentNum();
        Answer exceptedAnswer = Answer.createAnswer("1 3 5 8");
        Record exceptedRecord = exceptedAnswer.check(answer);
        assertThat(record.getValue(),is(exceptedRecord.getValue()));
    }

    @Test
    public void should_return_checked_result_record_with_2A2B(){
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        Record record = new Record();
        record.increaseCurrentNum();
        record.increaseCurrentNum();
        record.increaseIncludeOnlyNum();
        record.increaseIncludeOnlyNum();
        Answer exceptedAnswer = Answer.createAnswer("3 1 5 8");
        Record exceptedRecord = exceptedAnswer.check(answer);
        assertThat(record.getValue(),is(exceptedRecord.getValue()));
    }

    @Test
    public void should_return_checked_result_record_with_1A1B(){
        Answer answer = new Answer();
        answer.setNumList(new ArrayList<String>(){{
            add("1");
            add("3");
            add("5");
            add("8");
        }});
        Record record = new Record();
        record.increaseCurrentNum();
        record.increaseIncludeOnlyNum();
        Answer exceptedAnswer = Answer.createAnswer("5 2 6 8");
        Record exceptedRecord = exceptedAnswer.check(answer);
        assertThat(record.getValue(),is(exceptedRecord.getValue()));
    }
}