

public class AbenteuerPlattform implements IAbenteuerPlattform {
    //Attribute
    public String name;
    public String planet;
    public String ziel;
    public int belohnung;
    public int anzahlMitstreiter;
    public int angemeldeteSuperheroes; 

    //Konstruktor
    public AbenteuerPlattform(String name, String planet, String ziel, int belohnung, int anzahlMitstreiter, int angemeldeteSuperheroes) {
        this.name = name;
        this.planet = planet;
        this.ziel = ziel;
        this.belohnung = belohnung;
        this.anzahlMitstreiter = anzahlMitstreiter;
        this.angemeldeteSuperheroes = angemeldeteSuperheroes;
    }

    @Override
    public boolean abmelden(String superheroName, String nameAbenteuer) {

        return false;
    }

    @Override
    public boolean anmelden(String superheroName, String nameAbenteuer) {

        return false;  
    }

    @Override
    /**
     * Erstellt ein neues Abenteuer, so dass Superheroes danach suchen können.
     * @param name Name des Abenteuers
     * @param planet Name des Planeten
     * @param ziel Das Ziel des Abenteuers
     * @param belohnung Belohnung, die ausgeschüttet wird
     * @param anzahlMitstreiter Anzahl der erforderlichen Mitstreiter
     */
    public void erstelleAbenteuer(String name, String planet, String ziel, int belohnung, int anzahlMitstreiter) {

    }

    @Override
    public boolean loescheAbenteuer(String name) {

        return false;
    }

    @Override
    /**
     * Sucht nach einem passenden Abenteuer gemäß der angegebenen Parameter
     * @param planet Der Planet (null, falls der Planet irrelevant ist)
     * @param belohnung Die Belohnung (0, falls der Parameter irrelevant ist)
     * @param anzahlMitstreiter Die Anzahl der Mitstreiter (0, falls der Parameter irrelevant ist)
     * @return das passende Abenteuer
     */
    public Abenteuer sucheAbenteuer(String planet, int belohnung, int anzahlMitstreiter) {
        if(belohnung >= 0) {
            
        }
    }
}

