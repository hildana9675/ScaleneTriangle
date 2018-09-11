/* Hildana. M
 * ScaleneTriangle.java
 * This program allows users to find the area of a scalene triangle
 * 
 */
package scalenetriangle;
import javax.swing.*;

/**
 *
 * @author Hildana
 */
public class ScaleneTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double a, b, c, s, area;
        
        
        //User inputs the value of the three sides (a,b, and c) 
        a = Double.parseDouble(JOptionPane.showInputDialog("Insert side A of the scalene triangle"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Insert side B of the scalene triangle"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Insert side C of the scalene triangle"));
        
        
        //semi-perimeter
        s = (a + b + c)/2;
        
        //area of scalene triangle using Heron's formula
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        //Display the results
     	JOptionPane.showMessageDialog(null, "The area of the scalene triangle is: "
                   + area + "");
     
        
    }
    
}
