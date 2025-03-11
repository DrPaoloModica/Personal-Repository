package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Mazzo {

    private final List<Carta> carte;

    public Mazzo(List<Carta> carte) {
        this.carte = carte;
    }

    public void mischia() {
        Collections.shuffle(carte);
    }

    public int carteRimanenti() {
        return carte.size();
    }

    public Carta estrai() {
        
         */
        if (carteRimanenti() == 0) {
            throw new IllegalStateException("Il mazzo è vuoto, impossibile estrarre!");
        } else {
            return carte.remove(0);
        }
    }

    /*
    Esempio di overload di un metodo.
     */
    public List<Carta> estrai(int numeroCarte) {
        if (carteRimanenti() < numeroCarte) {
            throw new IllegalStateException("Rimangono " + carteRimanenti() + " nel mazzo, impossibile estrarne " + numeroCarte + "!");
        } else {
            List<Carta> carteEstratte = new ArrayList<>();
            for (int i = 0; i < numeroCarte; i++) {
                carteEstratte.add(estrai());
            }
            return carteEstratte;
        }
    }

    @Override
    public String toString() {
        return "Mazzo{" +
                "carte=" + carte +
                '}';
    }

    
    public static Mazzo mazzoCompleto() {
        
        List<Carta> carte = new ArrayList<>();
        //Gli aggiungo tutte le combinazioni possibili dei 2 enum
        for(Carta.Seme seme : Carta.Seme.values()) {
            for(Carta.Valore valore : Carta.Valore.values()) {
                carte.add(new Carta(seme, valore));
            }
        }
        return new Mazzo(carte);
    }
}
