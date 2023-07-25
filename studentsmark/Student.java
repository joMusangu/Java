/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsmark;

/**
 *
 * @author matsh
 */
public class Student {
    private String name;
    private int mark1,mark2,mark3;
    
    public Student(String n,int m1,int m2,int m3)
    {
        name=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return name+"\t"+mark1+"\t"+mark2+"\t"+mark3;
    }
}
