/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysfordays;

/**
 *
 * @author matsh
 */
public class Employees {
    private String fname;
    private int mark1,mark2,mark3;
    
    public Employees(String fn,int m1,int m2,int m3)
    {
        fname=fn;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    public String getFirstName()
    {
        String name= fname.substring(0,fname.indexOf(" "));
        return name;
    }
    public String getSurname()
    {
        String surname=fname.substring(fname.indexOf(" "));
        return surname;
    }
    public String toString()
    {
        return fname+" "+mark1+" "+mark2+" "+mark3;
    }
    public double getAverage()
    {
        double average = (mark1+mark2+mark3)/3;
        return average;
    }
    public double getHighestMark()
    {
        double hm;
        hm=mark3;
        if(mark1<mark2 && mark3<mark2)
        {
            return mark2;
        }
        else if (mark2<mark1 && mark3<mark1)
        {
            return mark1;
        }
        return hm;
    }
    public String getHighestTerm()
    {
        String  hT;
        hT= "term3";
           if(mark1<mark2 && mark3<mark2)
        {
            return "term 2";
        }
        else if (mark2<mark1 && mark3<mark1)
        {
            return "term 1";
        }
        return hT;
        
    }
}
