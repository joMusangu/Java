/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author matsh
 */
public class jArr {
    private jArr[] jArr= new jArr[150];
    private int size=0;
    
    public jArr()
    {
        try {
            Scanner scFile= new Scanner(new FileReader("txt"));
            String j,r,t;
            double w;
            while(scFile.hasNextLine())
            {
                j=scFile.nextLine();
                Scanner fc= new Scanner(j).useDelimiter("#");
                 j=fc.next();
                 r=fc.next();
                 t=fc.next();
                 w=fc.nextDouble();
                
            }
        } catch (Exception e) {
        }
    }
}
