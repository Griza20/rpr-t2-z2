package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Banka {
    private Long brojRacuna;
    List<Korisnik> korisnici = new ArrayList<Korisnik>();
    List<Uposlenik> uposlenici = new ArrayList<Uposlenik>();
    public Banka() {}
    public Korisnik kreirajNovogKorisnika(String i, String p){
        return new Korisnik(i,p);
    }
    public Uposlenik kreirajNovogUposlenika(String i, String p){
        return new Uposlenik(i,p);
    }
    public Racun kreirajRacunZaKorisnika(Korisnik k){
        return new Racun(k.racun.brojRacuna,k);
    }
}
