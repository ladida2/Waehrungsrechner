/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.waerhngsrechner;


import javax.swing.JOptionPane;

/**
 *
 * @author ch.schaefer
 */
public class Waerhngsrechner 
{

    public static void main(String[] args) 
    {
        
        
        double ergebnis;
        double euro;

        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den Betragt in Euro ein: \n");


        euro = Double.parseDouble(eingabe);
        ergebnis = euro * 0.9938 ; //kurs vom 5 Oktober 2022

    JOptionPane.showMessageDialog(null,"Die Summe ergibt genau: " + ergebnis + " Dollar");
         
        
      
    }//public static void main(String[] args) 
} //public class Waerhngsrechner 
