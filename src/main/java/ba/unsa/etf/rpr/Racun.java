package ba.unsa.etf.rpr;

public class Racun {
    Long brojRacuna;
    Osoba korisnikRacuna;
    boolean odobrenjePrekoracenja;
    double stanjeRacuna;
    public Racun(Long br, Osoba o){
        brojRacuna=br;
        korisnikRacuna=o;
    }
    public boolean izvrsiUplatu(double iznos){
        stanjeRacuna+=iznos;
        return true;
    }
    public boolean izvrsiIsplatu(double iznos){
        if(stanjeRacuna-iznos<0) return false;
        stanjeRacuna-=iznos;
        return true;
    }
    private boolean provjeriOdobrenjePrekoracenja(double stanjeRacuna){
        return stanjeRacuna<0;
    }
    public boolean odobriPrekoracenje(double iznos){
        stanjeRacuna-=iznos;
        return true;
    }
}
