/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnerproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author matsh
 */
public class LearnerArray {
        private Learner LearnerArr[] = new Learner[50];
    private int count =0;
    
    public LearnerArray() throws FileNotFoundException
    {
        try
        {
            Scanner scFile = new Scanner(new FileReader("Learner.txt"));
            while(scFile.hasNextLine())
            {
                String line =scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("%");
                String fname = scLine.next();
                double term1= scLine.nextDouble();
                double term2 =scLine.nextDouble();
                double term3 = scLine.nextDouble();
              
                
                
                LearnerArr[count] = new Learner(fname,term1,term2,term3);
                count ++;
            }scFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public String getAll()
    {
        String temp ="";
        for(int i=0;i<count;i++)
        {
            temp= temp+LearnerArr[i].toString()+"/n"; 
        }
        return temp;
    }
    public void sort()
    {
       for (int i=0;i<count-1;i++)
           {
               for (int i2=i+1;i2<count;i2++) 
               {
                     if (LearnerArr[i].getHighestMark()-(LearnerArr[i2].getHighestMark())>0)
                {
                        Learner temp = LearnerArr[i];
                        LearnerArr[i]=LearnerArr[i2];
                        LearnerArr[i2]= temp;
                    }
               {
               }
            }
    
}
    }
}
