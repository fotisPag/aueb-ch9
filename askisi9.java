package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;

public class askisi9 {
    public static void main(String[] args) throws IOException {

        try (
                BufferedReader br = new BufferedReader(new FileReader("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/askisi/mathites.txt"));
                PrintStream ps = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/askisi/primOut.txt");
                PrintStream er = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/askisi/log.txt");
                ) {
            String line, firstName, lastName;
            int lineNumber = 0, grade1 = 0, grade2 = 0;
            String[] splitted;
            double average = 0;

            while ((line = br.readLine()) != null) {
                lineNumber++;

                splitted = line.split(" +");
                firstName = splitted[0].trim();
                lastName = splitted[1].trim();
                if (isInt(splitted[2])) {
                    grade1 = Integer.parseInt(splitted[2]);
                }
                if (isInt(splitted[3])) {
                    grade1 = Integer.parseInt(splitted[3]);
                }

                average = (grade1 + grade2) / 2.0;

                if (((grade1 < 0) || (grade1 > 10)) || ((grade2 < 0) || (grade2 > 10))) {
                    er.println("Error in line " + lineNumber);
                } else {
                    ps.printf(Locale.US, "%s %s %.2f%n", firstName, lastName, average);
                }

            }
                System.out.println("Operation completed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
