package adt;

import main.Film;
import main.Sjanger;

public interface FilmArkivADT {

	Film[] hentFilmTabell();
	
	void leggTilFIlm(Film nyFilm);
	
	boolean slettFilm(int filmnr);
	
	Film[] soekTittel(String delstreng);
	
	Film[] soekProdusent(String delstreng);
	
	int antall(Sjanger sjanger);
	
	int antall();
	
	
}
