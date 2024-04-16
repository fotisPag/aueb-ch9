package gr.aueb.cf.ch9;

/*
 * Εκτυπώνει σε αρχείο χαρακτήρες με τη χρήση
 * των PrinStream και PrintWriter
 *
 * */




import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFilePrint {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9/IOSimpleTest1.txt");
        PrintWriter pw = new PrintWriter("C:/Users/Fotis/Videos/OPA/Video- 9/IOSimpleTest2.txt");

        ps.println("Hello world from Printstream");
        pw.println("Hello world from PrintWriter");

        ps.close();
        pw.close();
    }

}