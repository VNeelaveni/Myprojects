
class Pbl18
{
public static void main(String args[])
{
int a = 10, b = 99;
int i,j,flag=0;
       for (i = a; i <= b; i++) { 
            if (i == 1 || i == 0) 
                continue; 
            flag = 1; 
  
            for (j = 2; j <= i / 2; ++j) { 
                if (i % j == 0) { 
                    flag = 0; 
                    break; 
                } 
            } 
            if (flag == 1) 
                System.out.print(i+" "); 
        } 
}
}
