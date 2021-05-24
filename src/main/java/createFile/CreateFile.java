package createFile;

import java.io.File; //import the file class
import java.io.IOException; //import the ioexception class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("filename.txt");
            if(myObj.createNewFile()){
                System.out.println("\n File created: "+myObj.getName());
            }else{
                System.out.println("\n File already exists!");
            }
        }catch(IOException e){
            System.out.println("\n An error occurred!");
            e.printStackTrace();
        }
    }
}
