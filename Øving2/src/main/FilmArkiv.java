package main;

import adt.FilmArkivADT;

public class FilmArkiv implements FilmArkivADT {

	private Film[] filmTabell;
	private int antall;
	private final int kapasitet=10;
	
	public FilmArkiv() {
		antall=0;
		filmTabell = new Film[kapasitet];
	}
	
	@Override
	public Film[] hentFilmTabell() {
	return filmTabell;
	}

	@Override
	public void leggTilFIlm(Film nyFilm) {
		
		if (antall < filmTabell.length) {
			filmTabell[antall] = nyFilm;
			antall++;
		} else {
			System.out.println();
		}
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		boolean slettet=false;
		
		for(int i = 0; i < filmTabell.length; i++) {
			
		if(filmnr == filmTabell[antall].getFilmnr()) {
			filmTabell[i] = null;
			slettet = true;
			antall--;
		}
		if(slettet && i < antall-1) {
			filmTabell[i] = filmTabell[i+1];
			filmTabell[i+1] = null;
		}
		}
		return slettet;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		int antallTreff=0;
		
		// Sikkerhetsmetode
		if(antall == 0) {
			return null;
		}
		
		for (int i=0; i < antall; i++) {
			if(filmTabell[i].getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
				antallTreff++;
			}
		}
			if(antallTreff==0) {
				System.out.println("Ingen treff på søkeord: " + delstreng);
				return null;
			}
			
			Film[] treffTab = new Film[antallTreff];
			int j = 0;
			
			for (int i=0; i < antall; i++) {
				if(filmTabell[i].getTittel().toUpperCase().contains(delstreng.toUpperCase())) {
					treffTab[j] = filmTabell[i];
					j++;
				}
			}
			return treffTab;
		}


	@Override
	public Film[] soekProdusent(String delstreng) {
		int antallTreff=0;
		
		for (int i=0; i < antall; i++) {
			if(filmTabell[i].getFilmskaper().contains(delstreng)) {
				antallTreff++;
			}
		}
			if(antallTreff==0) {
				System.out.println("Ingen treff på søkeord: " + delstreng);
				return null;
			}
			
			Film[] treffTab = new Film[antallTreff];
			int j = 0;
			
			for (int i=0; i < antall; i++) {
				if(filmTabell[i].getFilmskaper().contains(delstreng)) {
					treffTab[j] = filmTabell[i];
					j++;
				}
			}
			return treffTab;
	}


	@Override
	public int antall(Sjanger sjanger) {
		int antallFilmer = 0;
		
		for(int i =0; i < antall; i++) {
			if (sjanger == filmTabell[i].getSjanger()) {
				antallFilmer++;
				i++;
			}
		}
		return antallFilmer;
	}

	@Override
	public int antall() {
		int antallFilmer = 0;
		
		for(int i=0; i < filmTabell.length; i++) {
			antall++;
			antallFilmer += antall;
			i++;
			}
			return antallFilmer;
		
		}
	}

	


