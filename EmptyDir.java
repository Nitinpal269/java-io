// To find the check directory is empty or not
import java.io.File;
public class EmptyDir
{
public static void main(String[] args)
{
File file=new File("D:\\program\\Input Output\\Character Stream");
if(file.isDirectory())
{
String[] files=file.list();
if(files.length>0)
{
System.out.println("The" +file.getPath()+" is not empty");
}
}
}
}
