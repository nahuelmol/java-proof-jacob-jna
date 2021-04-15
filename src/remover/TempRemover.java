package remover;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class TempRemover {
    public void main(String[] args){
        
        Path Tempath = FileSystems.getDefault().getPath("C:\\Users\\Alumno\\AppData\\Local\\Temp\\*");
        
        try {
            Files.delete(Tempath);
        }catch(NoSuchFileException x){
            System.err.format("%s: no such"+" file or directory%n",Tempath);
        }catch(IOException x){
            System.err.println(x);
        }
    }
}
