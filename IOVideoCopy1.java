package gr.aueb.cf.ch9;


import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
* Αντιγράφει ένα αρχείο βίντεο. Υπολογίζει το χρόνο
* αντιγραφής. Χρησιμοποιεί FileInputStream και
* FileOutPutStream διαβάζοντας και γράφοντας ένα
* byte τη φορά.
*
* @author fotisPag
*
* */
public class IOVideoCopy1 {
    public static void main(String[] args) throws java.io.IOException {
        int b, count = 0;

        try (FileInputStream in = new FileInputStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.5/test-video.mkv");
             FileOutputStream out = new FileOutputStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.5/test-video-copy.mkv")) {

            long start = System.nanoTime();
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("Το αρχείο με μέγεθος %d ΚBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f", elapsed / 1_000_000_000.0);
        }
    }
}
