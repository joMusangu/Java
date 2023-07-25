/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysfordays;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author matsh
 */
public class Array1 {
    private Employees emparr[]= new Employees[200];
    private int count=0;
    
    public Array1() throws FileNotFoundException
    {
        try {
            Scanner scFile= new Scanner(new FileReader("Herts.txt"));
            while(scFile.hasNextLine())
            {
                String line= scFile.nextLine();
                Scanner scLine= new Scanner(line).useDelimiter("%");
                String fname=scLine.next();
                int mark1=scLine.nextInt();
                int mark2=scLine.nextInt();
                int mark3=scLine.nextInt();
                scLine.close();
                emparr[count]= new Employees(fname,mark1,mark2,mark3);
                count++;
                scFile.close();
            }
        }
         catch (Exception e) 
        {
            System.out.println(e);
        }
    }
        public String getAll()
        {
            String temp="";
            for(int i=0;i<count;i++)
            {
                temp=temp+emparr[i].toString()+"\n";
            }
            return temp;
        }
        public void sort()
        {
            for(int i=0;i<count-1;i++)
            {
                for(int i2=i+1;i2<count;i++)
                {
                    if(emparr[i].getAverage()-emparr[i2].getAverage()>0)
                    {
                        Employees temp= emparr[i];
                        emparr[i]=emparr[i2];
                        emparr[i2]=temp;
                    }
                }
            }
        }
    
}
