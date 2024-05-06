package org.generation.italy;
//import oggetto Scanner e Random class
import java.util.Scanner;
import java.util.Random;
public class MorraCinese {

	public static void main(String[] args) {
		//dichiarazione oggetto Random
		Random r = new Random();
		//dichiarazione oggetto Scanner
		Scanner sc = new Scanner(System.in);
		//creazione Array
		String morra [] = {"Sasso", "Carta", "Forbici"};
		//inserimento dati
		int punteggioComputer;
		int punteggioUtente;
			punteggioComputer=0;
			punteggioUtente=0;
			System.out.println("Benvenuto nel nostro programma per giocare a Morra Cinese. Per iniziare la scrivere, la propria mossa: ");
			//inizio ciclo DO WHILE partita
			do {
			String mossaComputer = morra[r.nextInt(3)];
			String mossaUtente = sc.nextLine();
			//condizione pareggio partita
			if (mossaComputer.equalsIgnoreCase(mossaUtente)) {
			System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi abbiamo un pareggio, il punteggio rimarrà invariato.");
			System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
//vittoria utente sasso
			} else if (mossaComputer.equalsIgnoreCase("forbici")&& mossaUtente.equalsIgnoreCase("sasso")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai vinto, il tuo punteggio aumenterà di uno.");
				punteggioUtente++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
				//vittoria utente carta
			}else if (mossaComputer.equalsIgnoreCase("sasso")&& mossaUtente.equalsIgnoreCase("carta")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai vinto, il tuo punteggio aumenterà di uno.");
				punteggioUtente++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
				//vittoria utente forbici
			}else if (mossaComputer.equalsIgnoreCase("carta")&& mossaUtente.equalsIgnoreCase("forbici")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai vinto, il tuo punteggio aumenterà di uno.");
				punteggioUtente++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
//vittoria computer forbici
			}else if (mossaComputer.equalsIgnoreCase("forbici")&& mossaUtente.equalsIgnoreCase("carta")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai perso, il punteggio del computer aumenterà di uno.");
				punteggioComputer++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
				//vittoria computer carta
			}else if (mossaComputer.equalsIgnoreCase("carta")&& mossaUtente.equalsIgnoreCase("sasso")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai perso, il punteggio del computer aumenterà di uno.");
				punteggioComputer++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
				//vittoria computer sasso
			}else if (mossaComputer.equalsIgnoreCase("sasso")&& mossaUtente.equalsIgnoreCase("forbici")) {
				System.out.println("Hai selezionato "+mossaUtente+" e il computer ha selezionato "+mossaComputer+". Quindi hai perso, il punteggio del computer aumenterà di uno.");
				punteggioComputer++;
				System.out.println("L'attuale punteggio del computer è " +punteggioComputer+ ". Il il tuo attuale punteggio è "+punteggioUtente+".");
			//inserimento non valido
			}else {
				System.out.println("La mossa inserita non è valida, si prega di inserire una mossa corretta:");
			}
			//fine ciclo while
			/*
			 * 
			 * NON ESCE DAL CICLO RAGGIUNTO IL PUNTEGGIO DI 5
			 */
		}while(punteggioComputer<5 || punteggioUtente<5);
			//vincitore
			System.out.print("il vincitore è ");
			if(punteggioComputer>punteggioUtente) {
				System.out.println("il computer");
			}else {
				System.out.println("il giocatore. congratulazioni.");
			}
			//inizio richiesta nuova partita da iniziare
			
			

	}

}
