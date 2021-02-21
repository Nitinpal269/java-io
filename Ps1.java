import java.io.*;
class Ps1
{
public static void main(String[] args)throws IOException
{
FileOutputStream fout=new FileOutputStream("pss.txt");
PrintStream ps=new PrintStream(fout);
ps.println("hello");
ps.println("hy");
System.out.println("File created");
}
}

