public interface IAbenteuerPlattform {
    
    /**
     * Erstellt ein neues Abenteuer, so dass Superheroes danach suchen können.
     * @param name Name des Abenteuers
     * @param planet Name des Planeten
     * @param ziel Das Ziel des Abenteuers
     * @param belohnung Belohnung, die ausgeschüttet wird
     * @param anzahlMitstreiter Anzahl der erforderlichen Mitstreiter
     */
    void erstelleAbenteuer(String name, String planet, String ziel, int belohnung, int anzahlMitstreiter);
    

    /**
     * Löscht ein Abenteuer
     * @param name Name des Abenteuers
     * @return true wenn das Abenteuer erfolgreich gelöscht wurde, false ansonsten
     */
    boolean loescheAbenteuer(String name);

    /**
     * Sucht nach einem passenden Abenteuer gemäß der angegebenen Parameter
     * @param planet Der Planet (null, falls der Planet irrelevant ist)
     * @param belohnung Die Belohnung (0, falls der Parameter irrelevant ist)
     * @param anzahlMitstreiter Die Anzahl der Mitstreiter (0, falls der Parameter irrelevant ist)
     * @return das passende Abenteuer
     */
    Abenteuer sucheAbenteuer(String planet, int belohnung, int anzahlMitstreiter);

    /**
     * Meldet den Superhero für das Abenteuer an
     * @param superheroName Name des Superheroes
     * @param nameAbenteuer Name des Abenteuers
     * @return true, falls die Anmeldung erfolgreich ist, false ansonsten
     */
    boolean anmelden(String superheroName, String nameAbenteuer);

    /**
     * Meldet den Superhero von einem Abenteuer ab
     * @param superheroName Name des Superheroes
     * @param nameAbenteuer Name des Abenteuers
     * @return true, falls die Abmeldung erfolgreich ist, false ansonsten
     */
    boolean abmelden(String superheroName, String nameAbenteuer);
}
