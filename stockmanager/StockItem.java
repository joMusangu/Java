/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanager;

/**
 *
 * @author matsh
 */
public class StockItem {
    private String itemDscrp;
    private double cprice,nIS;
    static double markup=0.25;
    
    public StockItem(String iD,double cp,double n)
    {
        itemDscrp=iD;
        cprice=cp;
        nIS=n;
    }
    public String getItemDescription()
    {
        return itemDscrp;
    }
    public double getCostPrice()
    {
        return (cprice*markup)+cprice;
    }
    public double getNumberInstock()
    {
        return nIS;
    }
   public String toString()
   {
       return itemDscrp+getCostPrice()+nIS;
   }
}

