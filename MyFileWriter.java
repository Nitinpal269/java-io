import java.io.*;
class MyFileWriter
{
public static void main(String[] args)throws IOException
{
//FileOutputStream fw=new FileOutputStream("lalu.txt");//Write Mode
//FileOutputStream fw=new FileOutputStream("lalu.txt", true);//Append Mode
//FileOutputStream fw=new FileOutputStream(new File("D:\\program\\Input Output\\Byte Stream\\FileInputOutputStream\\lalu2.txt"));
FileOutputStream fw=new FileOutputStream(new File("D:\\program\\Input Output\\Byte Stream\\FileInputOutputStream\\lalu3.txt"),true);
String s="India is a good country";



byte ch[]=s.getBytes();
fw.write(ch);
for(int i=0; i<ch.length; i++)
//fw.write(ch[i]);
fw.close();
System.out.println("File created successfully");
}
}

class MyFileReader
{
public static void main(String[] args)throws IOException
{
FileInputStream fr=new FileInputStream("lalu.txt");
//FileInputStream fr=new FileInputStream(new File("D:\\program\\Input Output\\FileInputOutputStream\\lalu2.txt"));
int i=0;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
}

class MyFileReader1
{
public static void main(String[] args)throws IOException
{
FileInputStream fr=new FileInputStream("lalu.txt");
byte b[]=new byte[fr.available()];
fr.read(b);
String s=new String(b);
System.out.println(s);
}
}
