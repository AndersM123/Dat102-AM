package klient;

import adt.FilmArkivADT;
import main.FilmArkiv;

public class KlientFilmarkiv {

	public static void main(String[] args) {
		
		FilmArkivADT filmer = new FilmArkiv();
			Meny meny = new Meny(filmer);
		
			
			meny.start();
	}
	


}
