/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author matsh
 */
public class StockArray {
   private StockItem stockArr[]= new StockItem[100];
   private int count=0;
   
   public StockArray() throws FileNotFoundException
   {
       try {
           Scanner scFile = new Scanner (new FileReader("fasjf.txt"));
           while(scFile.hasNextLine())
           {
               String line =scFile.nextLine();
               Scanner sc= new Scanner (line).useDelimiter("#");
               String name= sc.next();
           }
       
                       } catch (Exception e) 
               {
               System.out.println(e);
               }
       }
   
        public String getAll()
        {
          String temp="";
          for(int i=0;i<count;i++)
          {
              temp=temp+partArr[i]+"\n";
          }
          return partArr[];
        }
}