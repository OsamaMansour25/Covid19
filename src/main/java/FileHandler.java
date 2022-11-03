import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<dataCovid> handler() {


         ArrayList<dataCovid> covidListe = new ArrayList<>();
        File f = new File("c:/Users/Bruger/OneDrive/Skrivebord/11_noegletal_pr_region_pr_aldersgruppe.csv");

        try {
            Scanner sc = new Scanner(f, StandardCharsets.ISO_8859_1);
            while (sc.hasNext()) {
                String linje = sc.nextLine();
                String[] attributter = linje.split(";");
                dataCovid covidData = new dataCovid(attributter[0],
                        attributter[1],
                        Integer.parseInt(attributter[2]),
                        Integer.parseInt(attributter[3]),
                        Integer.parseInt(attributter[4]),
                        Integer.parseInt(attributter[5]),
                        attributter[6]);

                covidListe.add(covidData);
            }
        }
        catch(Exception e){
            System.out.println("Fejl"+e.getMessage());
        }
        return covidListe;
    }
}


