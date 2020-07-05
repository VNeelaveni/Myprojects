class Pbl19
{
public static void main(String args[])
{
int l = args[0].length();
if(l==0)
{
System.out.println("Please enter an integer number");
}
else if(l!=0)
{
int i;
int n = Integer.parseInt(args[0]);
boolean flag = false;
if(n==0 || n==1)
{
System.out.println(n+" is neither prime nor composite");
}
else{
for(i=2;i<=n/2;++i)
{
if(n%i == 0)
{
flag = true;
break;
}
}
if(!flag)
{
System.out.println(n+" is a prime number");
}
else
{
System.out.println(n+" is not a prime number");
}
}
}
}
}
