class Pbl6
{
public static void main(String args[])
{
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int digit1=a%10;
int digit2=b%10;
	if (digit1==digit2)
	{
 		System.out.println("true");
        }
	else 
	{
		System.out.println("false");
	}
	}
}
