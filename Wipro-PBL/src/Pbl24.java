class Pbl24
{
public static void main(String args[])
{
 int p = 0;
 int num = 1;
while(p<5)
{
	while(num>=1)
	{
		if((num %2==0 && num%3==0) && (num%5==0))
			{
				p = p+1;
				System.out.println(num+" ");
				}
		num = num + 1;
		if(p==5)
		 {
			break;
			}		
	}
}
}
}
