package ibf2021.d3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManipulation 
{
public static void main( String[] args ){
    File file= Paths.get("/Users/mac_sur/Downloads/day1_code-main").toFile();

    if (!file.exists()){
        System.out.printf("The file does not exists");
    }
    else if (file.isFile()){
        System.out.printf("File name is %s\n",file.getName());
        System.out.printf("The size of the file is %d bytes\n", file.length());
    }
    else {
            for (File f: file.listFiles()){
            String name =f.getName();
            System.out.printf("filename: %s\n",name);
            }
    }
    }
}

