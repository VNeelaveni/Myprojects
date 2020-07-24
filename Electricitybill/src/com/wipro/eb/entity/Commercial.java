package com.wipro.eb.entity;

public class Commercial extends Connection {
 public  Commercial()
 {
  
 }
 public  Commercial(int currentReading,int previousReading,float[] slabs)
 {
  this.currentReading=currentReading;
  this.previousReading=previousReading;
  this.slabs=slabs;
  
 }
 public float computeBill()
 {
   float sum=0,EBill=0,FBill=0;
      int units=currentReading-previousReading;
      if(units<=50)
      {
        sum=(float) (units*slabs[0]);
      }
      else if(units>50 && units<=100)
      {
        sum=(float) ((units-50)*slabs[1]+50*slabs[0]);
      }
      else if(units>100)
      {
        sum=(float) ((units-100)*slabs[2]+50*slabs[1]+50*slabs[0]);
      }
      
      if(sum>=10000)
      {
        EBill=(float) (sum*0.09);
      }
      else if(sum>=5000)
      {
        EBill=(float) (sum*0.06);
      }
      else if(sum<5000)
      {
        EBill=(float) (sum*0.02);
      }
      
      FBill=sum+EBill;
      return FBill;
 }
 

}