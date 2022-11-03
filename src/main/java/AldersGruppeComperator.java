import java.util.Comparator;

    public class AldersGruppeComperator implements Comparator<dataCovid> {
        public int compare(dataCovid d1, dataCovid d2) {
            return d1.getAldersgruppe().compareTo(d2.getAldersgruppe());
        }

    }


