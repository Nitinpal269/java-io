import java.io.*;
class DataStream1
{
public static void main(String[] args)throws IOException
{
FileOutputStream fout=new FileOutputStream("ducat.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(10);
dout.writeLong(100);
dout.writeBoolean(true);
dout.writeDouble(10.9);
dout.close();
FileInputStream fin=new FileInputStream("ducat.txt");
DataInputStream din=new DataInputStream(fin);
int i=din.readInt();
long l=din.readLong();
boolean b=din.readBoolean();
double d=din.readDouble();
System.out.println(i);
System.out.println(l);
System.out.println(b);
System.out.println(d);
}
}
