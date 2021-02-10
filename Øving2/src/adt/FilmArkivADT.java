package adt;

import main.Film;
import main.Sjanger;

public interface FilmArkivADT {
	/**
	 * Metoden returner filmtabellen
	 * @return
	 */
	Film[] hentFilmTabell();
	
	/**
	 * Metoden legger til en ny film i filmtabellen
	 * @param nyFilm
	 */
	void leggTilFIlm(Film nyFilm);
	
	/**
	 * Metoden sletter film med gitt filmnr fra tabellen
	 * @param filmnr
	 * @return
	 */
	boolean slettFilm(int filmnr);
	
	/**
	 * Metoden søker etter film med gitt filmtittel
	 * @param delstreng
	 * @return
	 */
	Film[] soekTittel(String delstreng);
	
	/**
	 * Metoden søker etter film produsent etter gitt navn på produsent
	 * @param delstreng
	 * @return
	 */
	Film[] soekProdusent(String delstreng);
	
	/**
	 * Metoden teller antall filmer i angitt sjanger
	 * @param sjanger
	 * @return
	 */
	int antall(Sjanger sjanger);
	
	/**
	 *	Metoden returnerer antall filmer i gitt tabell
	 * @return
	 */
	int antall();
	
	
}
