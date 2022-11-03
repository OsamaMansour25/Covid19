public class dataCovid {
    private String region;
    private String aldersgruppe;
    int smittede;
    int døde;
    int indlagteIntensiv;
    int indlagte;
    String dato;

    public dataCovid(String region, String aldersgruppe, int smittede, int døde, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.smittede = smittede;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "dataCovid{" +
                "region='" + region + '\'' +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", smittede=" + smittede +
                ", døde=" + døde +
                ", indlagteIntensiv=" + indlagteIntensiv +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
    public String getRegion() {
        return region;
    }
    public String getAldersgruppe() {
        return aldersgruppe;
    }
}