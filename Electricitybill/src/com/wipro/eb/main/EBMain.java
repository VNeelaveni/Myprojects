package com.wipro.eb.main;
import com.wipro.eb.service.*;
public class EBMain {
 public static void main(String[] args) {
  
  System.out.println(new ConnectionService().generateBill(220,100,"Commercial"));
     System.out.println(new ConnectionService().generateBill(220,100,"Domestic"));
     System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
     System.out.println(new ConnectionService().generateBill(120,90,"Domestic")); 
 }
}