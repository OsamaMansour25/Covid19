import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Covid19Data {

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        Scanner sc = new Scanner(System.in);

        System.out.println("Velkommen til databasen over Covid19. Vælg om du vil sortere efter region eller aldersgruppe. " +
                "Tryk 1 for sortering efter region." +
                "Tryk 2 for sortering efter aldersgruppe");


        boolean isRunning = true;
        while (isRunning) {
            int brugervalg = sc.nextInt();
            switch (brugervalg) {
                case 1:
                    Collections.sort(fileHandler.handler(), new RegionComperator());
                    for (dataCovid covid : fileHandler.handler()) {
                        System.out.println(covid);
                    }
                    break;
                case 2:
                    System.out.println("\n--------------------------------------------------------\n");
                    Collections.sort(fileHandler.handler(), new AldersGruppeComperator());
                    for (dataCovid covid : fileHandler.handler()) {
                        System.out.println(covid);
                    }
                    break;

                case 3:
                    isRunning = false;
                    break;


            }
        }
    }
}



