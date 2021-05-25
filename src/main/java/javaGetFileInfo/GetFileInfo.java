package javaGetFileInfo;

import java.io.File; //import the file class

public class GetFileInfo {
    public static void main(String[] args) {
        File myObj = new File("c:\\users\\rosimar\\downloads\\filename.txt");
        if(myObj.exists()){
            System.out.println("\n File name: "+myObj.getName());
            System.out.println(" Absolute path: "+myObj.getAbsolutePath());
            System.out.println(" Writeable: "+myObj.canWrite());
            System.out.println(" Readable: "+myObj.canRead());
            System.out.println(" File size in bytes: "+myObj.length());
        }else{
            System.out.println("\n The file does not exist!");
        }
    }
}
