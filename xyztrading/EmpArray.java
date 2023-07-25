/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyztrading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author musangu
 */
public class EmpArray {
    private Employee EmpArr [] = new Employee[15];
    private int count = 0;
    
    public EmpArray()  throws FileNotFoundException
    {
        try
        {
            Scanner scFile = new Scanner(new FileReader("Employee.txt"));
            while (scFile.hasNextLine()){
                String line =scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                
                String name = scLine.next();
                String surname=scLine.next();
                String DoB = scLine.next();
                int NOD= scLine.nextInt();
                double salary=scLine.nextDouble();
                boolean medical=scLine.nextBoolean();
                
                EmpArr[count] = new Employee(name,surname, DoB, NOD, salary, medical);
                count ++;
            }
        scFile.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public String getAll()
    {
        String temp ="";
        for (int i=0;i<count;i++){
            temp = temp + EmpArr[i].toString()+"\n";
        }
        return temp;
    }
    public void sort()
    {
        for (int i=0;i<count-1;i++)
        {
            for (int i2=i+1;i<count;i++)
            {
                if (EmpArr[i].getSurname().compareTo(EmpArr[i2].getSurname())>0)
                {
                    Employee temp= EmpArr[i2];
                    EmpArr[i2]= EmpArr[i];
                    EmpArr[i]=temp;
                } 
            }
        }
        
    } 
    public String getMedicalAidEmps()
    {
        String temp="";
        for (int i=0;i<count;i++)
        {
            if (EmpArr[i].getMedical()==true)
            {
                temp = EmpArr[i].getSurname()+ " ,"+ EmpArr[i].getName()+ "\n";
            }
        }return temp;
    }
    public String getSalarySlips()
    {
        String temp="";
        for (int i=0;i<count;i++)
        {
            temp=temp + EmpArr[i].displayPaySlip()+ "\n\n";
        }
    return temp;
    }
    public String displaySalarySlips()
    {
      
        sort();
       String temp = "";
       for (int i = 0; i < count; i++) 
       {
          temp = temp + EmpArr[i].displayPaySlip()+"\n";
       }
       return temp;
    }
    public String BdayList()
    {
        String temp = " ";
        return temp;        
    }
}
