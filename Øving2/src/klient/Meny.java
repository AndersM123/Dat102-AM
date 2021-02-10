package klient;

import java.util.Scanner;

import adt.FilmArkivADT;
import main.Fil;
import main.FilmArkiv;
import main.Tekstgrensesnitt;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmArkivADT filmer;
	
	
	public Meny(FilmArkivADT filmer) {
		tekstgr = new Tekstgrensesnitt();
		this.filmer = filmer;
	}
	
	public void start() {
		
		Scanner scan = new Scanner(System.in);
		String filnavn = "";
		String s�k;
		String tom = null;
		int input = scan.nextInt();
		
		switch(input) {
		case 1:
			
		filmer = new FilmArkiv();
		System.out.println();
		tom = scan.nextLine();
		filnavn = scan.nextLine();
		Fil.skrivTilFil(filmer, filnavn);
		break;
		
		case 2:
			
		System.out.println("Hvilket filmarkiv?");
		tom=scan.nextLine();
		filnavn = scan.nextLine() + ".txt";
		filmer = Fil.lesFraFil(filmer, filnavn);
		break;
		}
		
		System.out.println("1. S�k filmtittel");
		System.out.println("2. S�k produsent");
		System.out.println("3. Skriv ut statistikk");
		System.out.println("4. Legg til film");
		System.out.println("5. Slett film");
		
		
		
		switch(input) {
			case 1:
				System.out.println("S�k filmtittel: ");
				tom = scan.nextLine();
				s�k = scan.nextLine();
				tekstgr.skrivUtFilmDelstrengITittel(filmer, s�k);
				break;
			
			case 2:
				System.out.println("S�k produsent: ");
				tom = scan.nextLine();
				s�k = scan.nextLine();
				tekstgr.s�kProdusent(s�k, filmer);
				break;
			
			case 3: 
				System.out.println("Skriv ut statistikk: ");
				tekstgr.skrivUtStatistikk(filmer);
			break;
			
			case 4:
				System.out.println("Navn p� film du vil legget til: ");
				filmer.leggTilFIlm(tekstgr.lesFilm());
				Fil.skrivTilFil(filmer, filnavn);
				break;
				
			case 5:
				System.out.println("Navn p� film du vil slette: ");
				input = scan.nextInt();
				filmer.slettFilm(input);
				Fil.skrivTilFil(filmer, filnavn);
				break;
				
			
			default:
				System.out.println("Ugyldig input");
		}
		
			scan.close();
		
			
			
		
		}
		
		
	
}