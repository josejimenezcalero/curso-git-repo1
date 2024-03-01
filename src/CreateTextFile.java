
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jose
 */
public class CreateTextFile {

    /**
     * @param args the command line arguments
     */
    private Formatter output;

    public void openFile(String filename) {
        {
            try {
                output = new Formatter(filename);
                System.out.println("This is a test.");
                System.out.println("This is another test");
                  System.out.println("This is another test");
            } catch (FileNotFoundException fileNotFoundException) {
                System.err.println("Error");
            }
        }
    }

    public void addText() {
        Random randomnumber = new Random();
        int lines = 1 + randomnumber.nextInt(10);

        String text[] = new String[lines];

        output.format("%s", "Hellooooo");
        
        output.close();

        /*for (int i = 0; i < lines; i++)
        {
            Textline tokens = new Textline("Hello",1);
            output.format("%s",tokens.toString());
        }*/
    }

}
