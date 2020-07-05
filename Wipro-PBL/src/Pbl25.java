class Pbl25
{
public static void main(String args[])
{
int [] a = new int[]{1,4,34,56,7};
int n = a.length;
int sum = 0;
double ave;
for(int i=0;i<n;i++)
{
sum = sum+a[i]; 
}
System.out.println("sum of arr elements is "+ sum);
ave = sum / n;
System.out.println("average of arr elements is "+ave);
}
}

