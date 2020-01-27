class biggest
{
public static void main(String args[])
{
int a,b,c ;
a = Integer.parseInt(args[0]);
b = Integer.parseInt(args[1]);
c = Integer.parseInt(args[2]);
if(a>b && a>c)
{
System.out.println(a);
}
else if (b>c && b>a)
{
System.out.println(b);
}
else if(c>a && c>b)
{
System.out.println(c);
}
}
}


