/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnerproject;

/**
 *
 * @author matsh
 */
public class Learner {
private String fname;
private double term1,term2,term3;

public Learner(String n,double t1,double t2,double t3 )
{
    fname=n;
    term1=t1;
    term2=t2;
    term3=t3;
}
public String getFirstName()
{
    String name= fname.substring(0,fname.indexOf(" "));
    return name;
}
public String getSurname()
{
    String surname=fname.substring(fname.indexOf(" "));
    return fname;
}
public double getAverage()
{
    double average=(term1+term2+term3)/3;
    return average;
}
public double getHighestMark()
{
    double highestMark; 
    highestMark= term1;
    if (term2>term1 && term2>term3 )
    {
        highestMark=term2;
    }
    else if(term3>term2 && term3>term1)
            {
                highestMark=term3;
            }
    return highestMark;
}
public String getHighestTerm()
{
       String highestTerm;
     highestTerm = "term1";
    if (term2>term1 && term2>term3 )
    {
        highestTerm="term2";
    }
    else if(term3>term2 && term3>term1)
            {
                highestTerm= "term3";
            }
    return highestTerm;
    
}
public String toString()
{
    
    return fname+ term1+term2+term3;
}
    
}
