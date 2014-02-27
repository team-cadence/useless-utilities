package singles.cadence;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by splug_000 on 2/27/14.
 */
public class SPPView extends JFrame
{
    private JTextArea jTextArea = new JTextArea();

    public SPPView()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        jTextArea.setEditable(false);
        add(jTextArea);
        setVisible(true);
    }

    public JTextArea getjTextArea()
    {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea)
    {
        this.jTextArea = jTextArea;
    }
}
