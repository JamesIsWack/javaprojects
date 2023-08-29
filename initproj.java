import java.util.*;
import java.io.*;


public class initproj {
    public static void main(String[] args) {

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Project name?");
        String projName = scannerObj.nextLine();
        new File("../"+projName).mkdirs();

        Scanner scannerObj2 = new Scanner(System.in);
        System.out.println("File name?");
        String fileName = scannerObj2.nextLine();
        new File("./"+projName+fileName+".java");

        scannerObj.close();
        scannerObj2.close();
    }
}