package javaapplication2;

//import Container.JacobClass;

import java.nio.file.Paths;
import java.nio.file.Path;

import java.io.File;
import java.io.IOException;

import java.net.URI;

import java.lang.Object;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;


public class JavaApplication2 {
    public static void main(String[] args){
        File file = new File("D:\\javaprove\\new_culoabierto.txt");
        
        Path path = FileSystems.getDefault().getPath("D:\\javaprove\\main.txt");
        
        boolean result;
        try {
            result = file.createNewFile();
            if (result){
                System.out.println("file created");
            }else {
                System.out.println("file not created");
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
        try {
            Files.delete(path);
        }catch(NoSuchFileException x){
            System.err.format("%s: no such"+" file or directory%n",path);
        }catch(IOException x){
            System.err.println(x);
        }
    }
}



