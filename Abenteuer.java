public class Abenteuer {
    //Attribute
    private String name;
    private String planet;
    private String ziel;
    private int belohnung;
    private int anzahlMitstreiter;
    private int angemeldeteSuperheroes;
    
    //Konstruktor
    public Abenteuer(String name, String planet, String ziel, int belohnung, int anzahlMitstreiter, int angemeldeteSuperheroes) {
        this.setName(name);
        this.setPlanet(planet);
        this.setZiel(ziel);
        this.setBelohnung(belohnung);
        this.setAnzahlMitstreiter(anzahlMitstreiter);
        this.setAngemeldeteSuperheroes(angemeldeteSuperheroes);
    }

    //Getter & Setter
    public int getAngemeldeteSuperheroes() {
        return angemeldeteSuperheroes;
    }

    public void setAngemeldeteSuperheroes(int angemeldeteSuperheroes) {
        this.angemeldeteSuperheroes = angemeldeteSuperheroes;
    }

    public int getAnzahlMitstreiter() {
        return anzahlMitstreiter;
    }

    public void setAnzahlMitstreiter(int anzahlMitstreiter) {
        this.anzahlMitstreiter = anzahlMitstreiter;
    }

    public int getBelohnung() {
        return belohnung;
    }

    public void setBelohnung(int belohnung) {
        this.belohnung = belohnung;
    }

    public String getZiel() {
        return ziel;
    }

    public void setZiel(String ziel) {
        this.ziel = ziel;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







}