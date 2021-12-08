package ibf2021.d3;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class FileManipulation2 {

    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];
        int size = 0;
        InputStream is = new FileInputStream("/Users/mac_sur/Downloads/day1_code-main/README.md");
        OutputStream os= new FileOutputStream(System.out);
        while (-1 != (size = is.read(buffer))){
            os.write(buffer, 0, size);

 
        }
        os.flush();
        os.close();
        is.close();
    }
    
}
