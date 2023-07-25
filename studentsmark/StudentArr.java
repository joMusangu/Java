/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsmark;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author matsh
 */
public class StudentArr {
    private Student[] strArr= new Student[100];
    private int count=0;
    
    public StudentArr()
    {
           try {
            Scanner scfile= new Scanner(new FileReader("Student.txt"));
            while(scfile.hasNextLine())
            {
                String line= scfile.nextLine();
                Scanner scLine= new Scanner (line).useDelimiter("#");
                String name=scLine.next();
                int mark1= scLine.nextInt();
                int mark2=scLine.nextInt();
                int mark3=scLine.nextInt();
                scLine.close();
                strArr[count]= new Student(name,mark1,mark2,mark3);
                count++;
            
            }
            scfile.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    public String getAll()
    {
        String temp="";
        for(int i=0;i<count;i++)
        {
            temp=temp+strArr[i].toString()+"\n";
        }
        return temp;
    }
    public void sort()
    {
        for(int i=0;i<count-1;i++)
        {
            for(int i2=i+1;i<count;i++)
            {
                if(strArr[i].getName().compareTo(strArr[i2].getName())>0)
                {
                  Student temp= strArr[i2];
                    strArr[i2]=strArr[i];
                    strArr[i]=temp;
                }
            }
        }
    }
    }

