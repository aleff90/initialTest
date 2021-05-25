package javaReadFile;

import java.io.File; //import the file class
import java.io.FileNotFoundException; //import this class to handle errors
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File myobj = new File("c:\\users\\userName\\downloads\\fileName.txt");
            Scanner myReader = new Scanner(myobj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch(FileNotFoundException e){
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}

//on line 10.
//to display any results in the console it is necessary that the file specified in the path has some content.