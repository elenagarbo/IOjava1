package basico;

import java.io.FilePermission;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.StandardCopyOption;
import java.security.PermissionCollection;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class Copiar {
	public static void main(String[] args) throws IOException {
	Path FROM = Paths.get("C:\\Users\\Curso mañana\\Desktop\\origen\\test.txt");
    Path TO = Paths.get("C:\\Users\\Curso mañana\\Desktop\\destino\\test.txt");

    CopyOption[] options = new CopyOption[]{
      StandardCopyOption.REPLACE_EXISTING,
      StandardCopyOption.COPY_ATTRIBUTES
    }; 
    Files.copy(FROM, TO, options);
    System.out.println("hola");
    
    String srg = "C:\\Users\\Curso mañana\\Desktop\\destino\\test.txt";  
   FilePermission file1 = new FilePermission("C:\\Users\\Curso mañana\\Desktop\\destino\\-", "read");  
      PermissionCollection permission = file1.newPermissionCollection();  
    permission.add(file1);  
    
    //FilePermission file2 = new FilePermission(srg, "write");  
   // permission.add(file2);  
    if(permission.implies(new FilePermission(srg, "read,write"))) {  
    System.out.println("Read, Write permission is granted for the path "+srg );  
    }else {  
   System.out.println("No Read, Write permission is granted for the path "+srg);            }  
  
}
}
