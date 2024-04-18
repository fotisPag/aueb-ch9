package gr.aueb.cf.ch9;

import java.io.*;

/*
* Διαβάζει από ένα αρχείο που έχει τη μορφή
* σε κάθε γραμμή:
* <όνομα χώρας> <όνομα πόλης> <όνομα πόλης> ....
* και γράφει σε ξεχωριστά αρχεία για κάθε χώρα
*
* @uthor fotisPag
* */
public class IOBufferedReaderCountries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.4/countries.txt"));
        PrintStream psGR = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.4/greece.txt");
        PrintStream psUK = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.4/uk.txt");
        PrintStream psGER = new PrintStream("C:/Users/Fotis/Videos/OPA/Video- 9. ΕίσοδοςΈξοδος Δεδομένων απόσε Αρχεία/9.4/germany.txt");

        String line;
        while ((line = br.readLine()) != null) {
            String[] splitted = line.split(" ");

//            if (splitted[0].equals("Greece")) {
//                psGR.println("GR Cities");
//                for (int i = 1; i < splitted.length; i++){
//                    psGR.print(splitted[i].trim().toUpperCase()+ " ");
//                }
//            } else if (splitted[0].equals("UK")){
//                psUK.println("UK Cities");
//                for (int i = 1; i < splitted.length; i++){
//                    psUK.print(splitted[i].trim().toUpperCase() + " ");
//                }
//            } else if (splitted[0].equals("Germany")) {
//                psGER.println("Germany Cities");
//                for (int i = 1; i < splitted.length; i++) {
//                    psGER.print(splitted[i].trim().toUpperCase() + " ");
//                }
//            } else {
//                System.err.print("No countries");
//            }

            switch (splitted[0]) {
                case "Greece":
                    psGR.println("GR Cities");
                    printCities(psGR, splitted);
                    break;
                case "UK":
                    psUK.println("UK Cities");
                    printCities(psUK, splitted);
                    break;
                case "Germany":
                    psGER.println("Ggermany Cities");
                    printCities(psGER, splitted);
                    break;
                default:
                    System.err.println("Wrong Country");
                    break;
            }


        }

    }
    public static void printCities(PrintStream ps, String[] cities) {
        for (int i = 1; i < cities.length; i++) {
            ps.print(cities[i].trim().toUpperCase() + " ");
        }
    }
}