import java.io.*;
import java.util.*;
class MyScanner1
{
public static void main(String[] args)throws IOException
{
Scanner s=new Scanner(System.in);
int i=s.nextInt();
double d=s.nextDouble();
float f1=s.nextFloat();
long l1=s.nextLong();
String z=s.nextLine();
System.out.println(i+l1+f1+d+z);
}
}
