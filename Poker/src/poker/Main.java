package poker;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Estrarre una classe "Mazzo" che provveda alle necessità principali
        del programma.
         */
        Mazzo mazzo = Mazzo.mazzoCompleto();
        mazzo.mischia();
        System.out.println(mazzo);

        //Creo le variabili di cui ho bisogno

        //Chiedo l'input
        
        int numeroMani = richiediNumeroMani();

        for (int i = numeroMani; i > 0; i--) {
            System.out.println(mazzo.estrai(5));
        }


    }

   
    private static int richiediNumeroMani() {
        int numeroMani = -1;
        System.out.print("Quante mani devo estrarre?\nNumero mani: ");
       
        try (Scanner scanner = new Scanner(System.in)) {
            while (numeroMani <= 0 || numeroMani > 9) {
                try {
                    numeroMani = scanner.nextInt();
                    if(numeroMani <= 0 || numeroMani > 9) {
                        System.out.println("Prego, inserire un numero maggiore di 0 ed inferiore a 9");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Prego, inserire un numero");
                    scanner.nextLine();
                }
            }
            return numeroMani;
        }
    }

}