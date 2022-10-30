package ba.unsa.etf.rpr;

/**
 * Class person
 *
 */
public class Osoba
{
    private String ime, prezime;
    public Osoba(String i, String p){
        ime=i;
        prezime=p;
    }
    public String toString(){
        return ime+" "+prezime;
    }
}
