package singles.cadence;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mads Røskar on 27.02.14.
 */
public class WordProcessorTest
{
    @Test
    public void testGetNextWord() throws Exception
    {
        List<String> stringList = new ArrayList<String>();

        String[] words = { "hello", "world", "I'm", "a", "little", "teapot" };

        for (String word : words)
        {
            stringList.add(word);
        }

        WordProcessor wp = new WordProcessor(stringList);

        assert wp.getNextWord().equals("hom");
    }
}
