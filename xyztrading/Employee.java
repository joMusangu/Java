/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyztrading;

/**
 *
 * @author musangu
 */
public class Employee {
    private String name,surname,DoB;
    private int  NOD;
    private double salary;
    private boolean medical;
    
public Employee(String n,String su,String dob,int nodepen,double s,boolean med )
{
 name=n;   
 surname=su;
 DoB=dob;
 NOD=nodepen;
 salary=s;
 medical=med;

}
public String getName()
{
    return name;
}
public String getSurname()
{
    return surname;
}
public String getDoB()
{
    return DoB;
}
public int getNOD()
{
    return NOD;
}
public double getSalary()
{
    return salary;
}
public boolean getMedical()
{
    return medical ;
}
 public String getDates()
    {
        String temp = "";
        temp = DoB.substring(6)+"/"+DoB.substring(4,6)+"/"+DoB.substring(0,4);
        return temp;
    }
public void setName(String n)
{
    name=n;
}
public void setSurname(String su)
{
    surname=su;
}
public void setDoB(String dob)
{
    DoB=dob;
}
public void setNOD(int nodepen)
{
    NOD=nodepen;
}
public void setSalary (double s)
{
    salary=s;
}
public void setMedical (boolean med)
{
    medical=med;
}
public String toString()
{
    return name+" "+surname+" "+DoB+" "+NOD+" "+salary+" "+medical;
}
public double mSalary()
{
    double msalary=0;
    msalary=salary/12;
    return msalary;
}
public double calcTax()
{
    double tax=0;
    tax = (mSalary())*30/100;
    return tax;
    
}
public double calcPension()
{
 
    double pension=0;
    pension = (mSalary())*7.5/10;
    pension=Math.round (pension);
    return pension;
    
}
public double calcMedAid()
{
    
    int MedicalAid=0;
    if (medical==true)
    {
    
        MedicalAid=1000+500*NOD;
        
    }   
     return MedicalAid;
}
public double calcNettSalary()
{
    double nSalary=0;
    nSalary= mSalary()-calcTax()-calcPension()-calcMedAid();
    return nSalary;
}
public String displayPaySlip()
{
    return name +"/t "+ surname+"/t "+ mSalary()+" /t"+ "/t"+calcNettSalary();
}
    
}
