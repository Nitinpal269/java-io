import java.io.*;
class MyByteWriter
{
public static void main(String[] args)throws IOException
{
ByteArrayOutputStream fw=new ByteArrayOutputStream();
String s="kha jaa rhe hoo";
byte ch[]=s.getBytes();
for(int i=0; i<ch.length; i++)
fw.write(ch[i]);//fw write(ch)
fw.writeTo(new FileOutputStream("hi.txt"));
fw.writeTo(new FileOutputStream("hello.txt"));
System.out.println(fw.toString());
byte z[]=fw.toByteArray();
ByteArrayInputStream fr=new ByteArrayInputStream(z);
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
}
}
