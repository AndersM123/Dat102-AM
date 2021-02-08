package main;

import java.util.Scanner;

import adt.FilmArkivADT;

public class Tekstgrensesnitt {

	public Film lesFilm() {
		
		Scanner scan = new Scanner(System.in);
		
			int filmnr = scan.nextInt();
			System.out.println(filmnr);
			
			String filmskaper = scan.nextLine();
			System.out.println(filmskaper);
			
			String tittel = scan.nextLine();
			System.out.println(tittel);
			
			int lanseringsår = scan.nextInt();
			System.out.println(lanseringsår);
			
			Sjanger sjanger = Sjanger.valueOf(scan.nextLine().toUpperCase());
			System.out.println(sjanger);
			
			String filmselskap = scan.nextLine();
			System.out.println(filmselskap);
			
			scan.close();
			
			Film nyFilm = new Film(filmnr, filmskaper, tittel, lanseringsår, sjanger, filmselskap);
			return nyFilm;
			
	}
	
	public void visFilm(Film film) {
		System.out.println(film.toString());
	}
	
	public void skrivUtFilmDelstrengITittel(FilmArkivADT filmer, String delstreng) {
		Film[] tab = filmer.soekTittel(delstreng);
		for(int i=0; i < tab.length; i++) {
			visFilm(tab[i]);
			System.out.println();
		}
	}
	
	public void skrivUtStatistikk(FilmArkivADT filmer) {
		
		System.out.println("Antall filmer i arkivet: " + filmer.antall());
		
		for (Sjanger s : Sjanger.values()) {
			System.out.println(s.toString() + ": " + filmer.antall(s));
		}
		
		System.out.println("Antall filmer: " + filmer.antall());
		
	}
	
	public void søkProdusent(String delstreng, FilmArkivADT filmer) {
		Film[] tab = filmer.soekProdusent(delstreng);
		for(int i=0; i < tab.length; i++) {
			visFilm(tab[i]);
			System.out.println();
		}
	}
	
	
}
