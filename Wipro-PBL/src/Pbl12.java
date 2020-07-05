class Pbl12
{
public static void main(String args[])
{
char c1 = args[0].charAt(0);
if(Character.isLowerCase(c1))
{
System.out.println(Character.toUpperCase(c1));
}
else if(Character.isUpperCase(c1))
{
System.out.println(Character.toLowerCase(c1));
}
}
}
