package gr.aueb.cf.ch9;


import java.io.*;

/*
 * Αντιγράφει ένα αρχείο βίντεο. Υπολογίζει το χρόνο
 * αντιγραφής. Χρησιμοποιεί BufferedInputStream, BufferedOutputStream ,FileInputStream και
 * FileOutPutStream διαβάζοντας και γράφοντας 8192 bytes
 * (= 8KBytes) τη φορά
 *
 * @author fotisPag
 *
 * */
public class IOVideoCopy3 {
    public static void main(String[] args)  {
        int b, count = 0;
        byte [] buf = new byte[8192];

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.5/test-video.mkv"));
             BufferedOutputStream out = new BufferedOutputStream (new FileOutputStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.5/test-video-copy.mkv")) ) {

            long start = System.nanoTime();
            while ((b = in.read(buf, 0, buf.length - 1)) != -1) {
                out.write(buf, 0, b);
                count+= b;
            }
            long end = System.nanoTime();
            long elapsed = end - start;

            System.out.printf("Το αρχείο με μέγεθος %d ΚBytes (%d bytes) αντιγράφηκε%n", count / 1024, count);
            System.out.printf("Time: %.2f", elapsed / 1_000_000_000.0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
