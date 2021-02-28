import java .io.File;
//create Delete Rename
public class CDR
{
public static void main(String[] args)throws Exception
{
File newFile=new File("mg_new_file.txt");
printFileDetails(newFile);

//create a new file
boolean fileCreated=newFile.createNewFile();
if(!fileCreated)
{
System.out.println(newFile+"could not be created");
}

//Delete the new file
newFile.delete();
System.out.println("After deleting the new file: ");
printFileDetails(newFile);

//recreate the file
newFile.createNewFile();
printFileDetails(newFile);

//lets tell the jvm to delete this file on exit
newFile.deleteOnExit();
System.out.println("After using deleteOnExit() method: ");
printFileDetails(newFile);

//create a new File and rename it
File firstFile =new File("my_first_file.txt");
File secondFile=new File("my_second_file.txt");
fileCreated=firstFile.createNewFile();
if(fileCreated || firstFile.exists())
{
printFileDetails(firstFile);
printFileDetails(secondFile);

boolean renameFlag=firstFile.renameTo(secondFile);
if(!renameFlag)
{
System.out.println("could not rename"+firstFile);
}
printFileDetails(firstFile);
printFileDetails(secondFile);
}
}

public static void printFileDetails(File f)
{
System.out.println("Absolute Path;"+f.getAbsoluteFile());
System.out.println("File exists: "+f.exists());
}
}
