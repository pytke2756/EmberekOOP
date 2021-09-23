package hu.petrik;

public class Main {

    public static void main(String[] args) {
        Ember e1 = new Ember("Jóska Pista", "1999-12-1", "Pécs");
        Ember e2 = new Ember("Vicc Elek", "1922-11-4", "Győr");
        Ember e3 = new Ember("Teszt Teszt", "1933-10-2", "Budapest");
        Ember e4 = new Ember("Teszt2 Teszt", "1933-10-2", "Budapest");
        Ember e5 = new Ember("Teszt3 Teszt", "1933-10-2", "Budapest");

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        /*System.out.println(e1.szulEv());
        System.out.println(e2.szulEv());
        System.out.println(e3.szulEv());

        System.out.println(e1.eletkor());
        System.out.println(e2.eletkor());
        System.out.println(e3.eletkor());*/

        //Ember[] emberek = {e1,e2,e3,e4,e5};
        //Emberek ek1 = new Emberek(emberek);
        //System.out.println(ek1);


        Emberek ek2 = new Emberek("emberek.txt");
        //System.out.println(ek2);
        System.out.println("Az adott hónapban született emberek száma: " + ek2.honapSzuletes(4));
        System.out.println("Az átlag életkor: " + ek2.atlagEletkor());
        System.out.println("A legfiatalabb ember neve: " + ek2.legfiatalabbEmberNeve());
        System.out.println("A legidősebb ember sorszáma: " + ek2.legidosebbEmber());




    }
}
