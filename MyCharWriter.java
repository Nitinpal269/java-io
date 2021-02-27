import java.io.*;
class MyCharWriter
{
public static void main(String[] args)throws IOException
{
CharArrayWriter fw=new CharArrayWriter();
String s="india is good country sss";
char ch[] =s.toCharArray();
//for(int i=0; i<ch.length; i++)
fw.write(s);
//fw.write(ch);
fw.writeTo(new FileWriter("abc1.txt"));
System.out.println(fw.toString());
char z[]=fw.toCharArray();
CharArrayReader fr=new CharArrayReader(z);
int i=0;
while((i=fr.read())!=-1)
System.out.println((char)i);
}
}
