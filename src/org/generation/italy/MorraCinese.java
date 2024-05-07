package org.generation.italy;

//import oggetto Scanner e Random class
import java.util.Scanner;
import java.util.Random;

public class MorraCinese {

	public static void main(String[] args) {
		// dichiarazione oggetto Random
		Random r = new Random();
		// dichiarazione oggetto Scanner
		Scanner sc = new Scanner(System.in);
		// creazione Array
		String morra[] = { "Sasso", "Carta", "Forbici" };
		// inserimento dati
		int punteggioComputer;
		int punteggioUtente;
		String risposta;
		do {
			punteggioComputer = 0;
			punteggioUtente = 0;
			System.out.println(
					"Benvenuto nel nostro programma per giocare a Morra Cinese. Vincerà chi arriveerà prima a 5. Per iniziare la scrivere, la propria mossa: ");
			// inizio ciclo DO WHILE partita
			do {
				String mossaComputer = morra[r.nextInt(3)];
				String mossaUtente = sc.nextLine();
				// condizione pareggio partita
				if (mossaComputer.equalsIgnoreCase(mossaUtente)) {
					System.out.println("Hai selezionato " + mossaUtente + " e il computer ha selezionato "
							+ mossaComputer + ". Quindi abbiamo un pareggio, il punteggio rimarrà invariato.");
					System.out.println("L'attuale punteggio del computer è " + punteggioComputer
							+ ". Il il tuo attuale punteggio è " + punteggioUtente + ".");
						if(punteggioComputer<5&&punteggioUtente<5) {
						System.out.println("Inserisci una nuova mossa:");
						}
					// vittoria utente 
				} else if ((mossaComputer.equalsIgnoreCase("forbici") && mossaUtente.equalsIgnoreCase("sasso")) || (mossaComputer.equalsIgnoreCase("sasso") && mossaUtente.equalsIgnoreCase("carta"))||(mossaComputer.equalsIgnoreCase("carta") && mossaUtente.equalsIgnoreCase("forbici"))) {
					System.out.println("Hai selezionato " + mossaUtente + " e il computer ha selezionato "
							+ mossaComputer + ". Quindi hai vinto, il tuo punteggio aumenterà di uno.");
					punteggioUtente++;
					System.out.println("L'attuale punteggio del computer è " + punteggioComputer
							+ ". Il il tuo attuale punteggio è " + punteggioUtente + ".");
						if(punteggioComputer<5&&punteggioUtente<5) {
						System.out.println("Inserisci una nuova mossa:");
						}	
					// vittoria computer 
				} else if ((mossaComputer.equalsIgnoreCase("forbici") && mossaUtente.equalsIgnoreCase("carta"))||(mossaComputer.equalsIgnoreCase("carta") && mossaUtente.equalsIgnoreCase("sasso"))||(mossaComputer.equalsIgnoreCase("sasso") && mossaUtente.equalsIgnoreCase("forbici"))) {
					System.out.println("Hai selezionato " + mossaUtente + " e il computer ha selezionato "
							+ mossaComputer + ". Quindi hai perso, il punteggio del computer aumenterà di uno.");
					punteggioComputer++;
					System.out.println("L'attuale punteggio del computer è " + punteggioComputer
							+ ". Il il tuo attuale punteggio è " + punteggioUtente + ".");
						if(punteggioComputer<5&&punteggioUtente<5) {
						System.out.println("Inserisci una nuova mossa:");
						}
					// inserimento non valido
				} else {
					System.out.println("La mossa inserita non è valida, si prega di inserire una mossa corretta:");
				}
				
				// fine ciclo do while

			} while (punteggioComputer < 5 && punteggioUtente < 5);
			// vincitore
			System.out.print("il vincitore è ");
			if (punteggioComputer > punteggioUtente) {
				System.out.println("il computer");
			} else {
				System.out.println("il giocatore. congratulazioni.");
			}
			// inizio richiesta nuova partita da iniziare
			System.out.println("vuoi iniziare una nuova partita?");
			risposta = sc.nextLine();
		} while (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("sì"));

		System.out.println("Gazie per aver giocato, arrivederci.");

	}// fine main

}// fine progetto
