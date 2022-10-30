package ba.unsa.etf.rpr;

public class Main {
    public static void main(String args[]){
        Osoba o = new Osoba("Amar","Grizovic");
        o.toString();
        System.out.println(o);
        Uposlenik u = new Uposlenik("Amar","Grizovic");
        u.toString();
        System.out.println(u);
    }
}
