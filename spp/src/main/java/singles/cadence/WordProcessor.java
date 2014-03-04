package singles.cadence;

import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by Mads Røskar on 27.02.14.
 */
public class WordProcessor
{

    private List<String> words;
    private int index;
    Logger logger = Logger.getLogger(WordProcessor.class);

    public WordProcessor(List<String> words)
    {
        setWords(words);
        setIndex(0);
    }

    public WordProcessor(List<String> words, int index)
    {
        setWords(words);
        setIndex(index);

    }

    public List<String> getWords()
    {
        return words;
    }

    public void setWords(List<String> words)
    {
        this.words = words;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public boolean incrementIndex()
    {
        if (index + 1 <= words.size() - 1)
        {
            index++;
            return true;
        }
        return false;
    }

    public String getNextWord()
    {
        String result = "";
        if(words.get(index).equals(""))
        {
            incrementIndex();
        }
        for (int i = 0; i <= words.get(index).length(); i++)
        {
            if (words.size() - 1 >= index + i)
            {
                if(words.get(index + i).equals(""))
                {
                    words.remove(index + i);
                }
                String word = words.get(index + i);
                if(word.length() - 1 < i)
                {
                    result = result.concat(String.valueOf(word.charAt(word.length() - 1)));
                    words.set(index + i, String.valueOf(new StringBuilder(word).deleteCharAt(word.length() - 1)));
                }
                else
                {
                    result = result.concat(String.valueOf(word.charAt(i)));
                    words.set(index + i, String.valueOf(new StringBuilder(word).deleteCharAt(i)));
                }

                logger.debug("String: " + words.get(i));

            }

        }

        return result;
    }

}
