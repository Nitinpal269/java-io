import java.util.Scanner;
public class ScannerCalculator
{
public static void main(String[] args)
{
System.out.println("type something like: 1+3");
Scanner scanner=new Scanner(System.in);
double n1=0.0;
double n2=0.0;
String operation=null;
try
{
n1=scanner.nextDouble();
operation=scanner.next();
n2=scanner.nextDouble();
double result=calculate(n1, n2, operation);
System.out.println("%s%s%s=%2f%n", n1, n2, operation, result);
}
catch(Exception e)
{
	System.out.println("An invalid expression");
e.printStackTrace();
e.getMessage();
}
}
public static double calculate(double op1, double op2, String operation)
{
switch(operation)
{
case "+":
return op1 + op2;
case "-":
return op1 - op2;
case "*":
return op1 * op2;
case "/":
return op1 / op2;
}
return Double.NaN;
}
}

