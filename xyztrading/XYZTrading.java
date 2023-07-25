/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyztrading;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author musangu
 */
public class XYZTrading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
   EmpArray employees = new EmpArray();
   String EmployeeInfo = JOptionPane.showInputDialog("Type in  letter."+"\nA. all employees"+ "\nB. employees on medical aid"+"\nC. sort employees (A-Z)"+ "\nD. BDayList"+"\nE. salary slips"+ "\nX. exit.").toUpperCase();
        while (!(EmployeeInfo.equals("A")||EmployeeInfo.equals("B")||EmployeeInfo.equals("C")||EmployeeInfo.equals("E")||EmployeeInfo.equals("X")))
        {
   EmployeeInfo = JOptionPane.showInputDialog("Type in letter."+"\nA. all employees"+ "\nB. employees on medical aid"+"\nC. sort employees (A-Z)"+"\nD. BDayList"+"\nE. salary slips"+"\nX. exit.").toUpperCase();
        }
      switch(EmployeeInfo)
        {
            case "A":
                System.out.println( employees.getAll());
                break;
            case "B":
                System.out.println(employees.getMedicalAidEmps());
                break;
            case "C":
                System.out.println(employees.sort());
                break;
             case "D":
              System.out.println(employees.BdayList());
                break;
            case "E":
              System.out.println(   employees.getSalarySlips());
                break;
            case "X":
                System.exit(25);
                break;
        }
    }
    
}
     
    

    

        
        
    
    

