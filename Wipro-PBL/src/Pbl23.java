class Pbl23
{
public static void main (String args[])
{
int num = Integer.parseInt(args[0]);
int reversenum = 0;
int temp = num;
while( num != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + num%10;
          num = num/10;
      }
if(temp == reversenum)
{
System.out.println(temp+" is a palindrome");
}
else
{
System.out.println(temp+" is not a palindrome");
}
}
}
