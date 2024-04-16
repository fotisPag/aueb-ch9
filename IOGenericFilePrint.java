package gr.aueb.cf.ch9;



/*
* Δημιουργεί ένα PrintStream και ένα PrintWriter
* με τις εξής ιδιότητες
* 1. Autoflush
* 2. Encoding UTF-8
* 3. File Append
* 4. Locale
*
* */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class IOGenericFilePrint {
    public static void main(String[] args) {

            try {
                PrintStream ps = new PrintStream(new FileOutputStream("C:/Users/Fotis/Videos/OPA/Video- 9/IOSimpleAllTest1.txt", true), true, "UTF-8");
                PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/Fotis/Videos/OPA/Video- 9/IOSimpleAllTest2.txt", true), StandardCharsets.UTF_8), true);

                ps.printf(Locale.US, "%.2f%n", 7.45);
                ps.printf(Locale.getDefault(), "%.2f%n", 8.75);

                ps.close();
                pw.close();
            } catch (FileNotFoundException e) {
               System.out.println("Το αρχείο δεν βρέθηκε");
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
    }

}
