/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class UseCreateTextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CreateTextFile c = new CreateTextFile();
        
        c.openFile("c:\\tmp\\probandoJose.txt");
        c.addText();
        
        
    }
    
}
