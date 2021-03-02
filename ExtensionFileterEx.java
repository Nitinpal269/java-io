// To find the java file in a folder
import java.io.File;
import java.io.FilenameFilter;
public class ExtensionFileterEx
{
public static void main(String[] args)
{
String dirname="D:\\program\\Array assignment program";
File f1=new File(dirname);
FilenameFilter only=new ExtensionFileter("java");
String s[]=f1.list(only);
for(int i=0; i<s.length; i++)
{
System.out.println(s[i]);
}
}
}

class ExtensionFileter implements FilenameFilter
{
String ext;
int i=1;
public ExtensionFileter(String ext)
{
this.ext="."+ext;
}
public boolean accept(File dir, String name)
{
System.out.println("accept");
return name.endsWith(ext);
}
}
