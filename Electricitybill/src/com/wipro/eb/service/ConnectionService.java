package com.wipro.eb.service;
import com.wipro.eb.exception.*;
import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
public class ConnectionService 
{
  public boolean validate(int currentReading, int previousReading, String type) 
      throws InvalidReadingException, InvalidConnectionException
  {
    if(currentReading<previousReading||previousReading<0||currentReading<0)
    {
      throw new InvalidReadingException();
    }
    if(!(type.equals("Domestic")|| type.equals("Commercial")))
        {
            throw new InvalidConnectionException(); 
        }
    return true;
  }
  
  public float calculateBillAmt(int currentReading, int previousReading, String type)
  {
    float bill=0;
    try
        {
           boolean b=validate( currentReading, previousReading,type);
           if(b==true)
           {
             if(type.equals("Commercial"))
             {
               float[] v= {5.2f,6.8f,8.3f};
               Commercial c=new Commercial(currentReading,previousReading,v);
               bill=c.computeBill();
             }
             else
             {
               float[] v= {2.3f,4.2f,5.5f};
               Domestic d=new Domestic(currentReading,previousReading,v);
               bill=d.computeBill();
             }
             return bill;
           }
        }
    catch(InvalidReadingException e)
        {
            System.out.println(e);
            return -1;
        }
        catch(InvalidConnectionException e)
        {
            System.out.println(e);
            return -2;
        }
    
    return 0.0F;
  }
  
  public String generateBill(int currentReading, int previousReading, String type)
  {
    float billAmt=calculateBillAmt(currentReading,previousReading,type);
    
     if(billAmt==-1)
              return "Incorrect Reading";
          else if(billAmt==-2)
              return "Invalid Connection Type";
    return "Amount is:"+billAmt;
  }
    
}