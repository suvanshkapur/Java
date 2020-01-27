class fibo
{
public static void main(String args[])
{
Integer a = new Integer(0);
Integer b = new Integer(1);
Integer temp = new Integer(0);
System.out.println(a);
System.out.println(b);
for(int i = 0; i<5; i++)
{
System.out.println(a+b);
temp=a;
a=b;
b= temp + b;
}
}
}

