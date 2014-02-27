package singles.cadence;

/**
 * Created by splug_000 on 2/27/14.
 */
public class SPPClient
{
    public static void main(String[] args)
    {
        SPPView sppView = new SPPView();
        sppView.getjTextArea().setText("Hello world");

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        sppView.getjTextArea().setText("Bananas are awesome!");
    }
}
