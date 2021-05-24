package javaWriteFile;

import java.io.FileWriter; //import the FileWriter class
import java.io.IOException; //import the ioexception class to handle errors

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("c:\\users\\userName\\documents\\fileName2.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("\n Successfully wrote to the file!");
        }catch(IOException e){
            System.out.println("\n An error occurred!");
            e.printStackTrace();
        }
    }
}
