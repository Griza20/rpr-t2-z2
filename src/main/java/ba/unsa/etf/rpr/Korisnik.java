package ba.unsa.etf.rpr;

public class Korisnik extends Osoba{
    Racun racun;
    public Korisnik(String i, String p){
        super(i,p);
    }
    public void dodajRacun(Racun r){
        racun = r;
    }
}
