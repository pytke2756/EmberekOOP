package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.OptionalInt;

public class Emberek {
    private List<Ember> emberekLista;
    private FileReader fr;
    private BufferedReader br;

    public Emberek(Ember[] emberekTomb){
        this.emberekLista = new ArrayList<>();
        for (int i = 0; i < emberekTomb.length; i++) {
            emberekLista.add(emberekTomb[i]);
        }
    }

    public Emberek(String fileNev){
        this.emberekLista = new ArrayList<>();
        try {
            this.fr = new FileReader(fileNev);
            this.br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null){
                String[] adatok = line.split(";");
                Ember obj = new Ember(adatok[0], adatok[1], adatok[2]);
                emberekLista.add(obj);
                line = br.readLine();
            }

            br.close();
            fr.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public int honapSzuletes(int honapSzama){
        int db = 0;
        for (Ember item : emberekLista) {
            if (item.szulHonap() == honapSzama) {
                db++;
            }
        }
        return db;
    }

    public int atlagEletkor(){
        int ossz = 0;
        for (Ember item : emberekLista) {
            ossz += item.eletkor();
        }
        //System.out.println(emberekLista.size());
        return (int)(ossz / (emberekLista.size()));
    }

    public void atlagosBmi(){
        //nincs adat
    }

    public String legfiatalabbEmberNeve(){
        Ember legfiatalabb = emberekLista.get(0);
        for (int i = 1; i < emberekLista.size(); i++) {
            if (emberekLista.get(i).eletkor() < legfiatalabb.eletkor()){
                legfiatalabb = emberekLista.get(i);
            }
        }
        return legfiatalabb.getNev();
    }

    public int legidosebbEmber(){
        int legidosebbEmberIndex = emberekLista.size() - 1;
        for (int i = emberekLista.size() - 1; i > -1; i--) {
            if (emberekLista.get(legidosebbEmberIndex).eletkor() < emberekLista.get(i).eletkor()){
                legidosebbEmberIndex = i;
            }
        }
        return legidosebbEmberIndex;
    }

    @Override
    public String toString() {
        String listaKi = "";
        for (Ember item : emberekLista) {
            listaKi += item + "\n";
        }
        return listaKi;
    }
}
