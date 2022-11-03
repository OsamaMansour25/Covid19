import java.util.Comparator;
    public class RegionComperator implements Comparator<dataCovid> {
        public int compare(dataCovid d1, dataCovid d2) {
            return d1.getRegion().compareTo(d2.getRegion());
        }

        }


