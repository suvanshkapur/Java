class calc
{
public static void main(String args[])
{
Integer a = new Integer(Integer.parseInt(args[0]));
Integer b = new Integer(Integer.parseInt(args[1]));
Integer c = new Integer(0);
if(args[2] == "plus")
{
c = a+b;
System.out.println(c);
} 
if(args[2] == "sub")
{
c = a-b;
System.out.println(c);
} 
if(args[2] == "mult")
{
c = a*b;
System.out.println(c);
} 
if(args[2] == "div")
{
if (b==0)
System.out.println("0 division error");
c = a/b;
System.out.println(c);
} 
}
}
