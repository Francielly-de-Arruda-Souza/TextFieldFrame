/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfieldtest;

/**
 *
 * @author franc
 */

import javax.swing.JFrame;
public class TextFieldTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         TextFieldFrame textFieldFrame = new TextFieldFrame(); 
         textFieldFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
         textFieldFrame.setSize( 350, 100 ); // set frame size
         textFieldFrame.setVisible( true ); // display frame
    }
    
}
