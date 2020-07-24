package com.wipro.eb.entity;

public class Domestic  extends Connection{
 public Domestic()
 {
  
 }
 public Domestic(int currentReading,int previousReading,float[] slabs)
 {
  this.currentReading=currentReading;
  this.previousReading=previousReading;
  this.slabs=slabs;
  
 }
 public float computeBill()
 {
     float sum=0;
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
     return sum;
 }
 
}