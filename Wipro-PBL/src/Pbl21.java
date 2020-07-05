class Pbl21
{
public static void main(String args[])
{
  int l = args[0].length();
  if(l==0)
 {
	System.out.println("Please enter an integer number");
 }
	else
	{
	 int n = Integer.parseInt(args[0]);
	 int i,d;
	for(i=1;i<=n;i++)
	{
		d = 1;
		while(d<=i)
		{
			System.out.print("*"+" ");
			d++;
		}
	System.out.println();
	}
	}
}
}
