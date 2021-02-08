package main;

import adt.FilmArkivADT;

public class FilmArkiv2 implements FilmArkivADT {

	private int antall;
	private LinearNode<Film> start;
	
	public FilmArkiv2() {
		antall = 0;
	}
	
	@Override
	public Film[] hentFilmTabell() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * Her kj�rer en while loop, n�r p sin neste node ikke er tom. Da henter vi p sitt neste punkt.
	 * s� hvis det blir gjort, settes p til � bli den nye og neste tomme noden. s� vi er klar for � legge til enda en ny film.
	 * med p.setNeste(neste) bruker vi de forh�ndsdefinerte variablene til � sette den nye filmen og/eller det nye elementet
	 * p� den neste ledige noden.
	 */
	@Override
	public void leggTilFIlm(Film nyFilm) {
		LinearNode<Film> neste = new LinearNode<Film>();
		neste.setElement(nyFilm);
		LinearNode<Film> p = start;
		
		while(p.getNeste() != null) {
			p = p.getNeste();
		}
		p.setNeste(neste);
		antall++;
	}
	
	/*
	 * Her sjekker vi i f�rste if om det er start noden som skal slettes, hvis s�, blir den slettet n�r vi setter start = p.getneste().
	 * i den neste kj�res en l�kke sammen med if for � 
	 */
	
	@Override
	public boolean slettFilm(int filmnr) {
		boolean funnet = false;
		LinearNode<Film> forrige = null;
		LinearNode<Film> p = start;	
		
		if(p.getElement().getFilmnr() == filmnr) {
			start = p.getNeste();
			funnet = true;
		}
		
		for (int s�k = 0; s�k < antall && !funnet; s�k++) {
			if(p.getElement().getFilmnr() == filmnr) {
				forrige.setNeste(p.getNeste());
				funnet = true;
				antall--; 
			} else {
				forrige = p;
				p = p.getNeste();
			}
		}
		return funnet;
	}
	@Override
	public Film[] soekTittel(String delstreng) {
		LinearNode<Film> denne = start;
		Film[] bibli = new Film[antall]; 
		int antallFilmer = 0;
		
		while (denne.getNeste() != null) {
			
		if(denne.getElement().getTittel().contains(delstreng)) {
				bibli[antallFilmer] = denne.getElement();
				antallFilmer++;
			}
			denne = denne.getNeste();
		}
		return bibli;
	}
	@Override
	public Film[] soekProdusent(String delstreng) {
		LinearNode<Film> denne = start;
		Film[] bibli = new Film[antall]; 
		int antallFilmer = 0;
		
		while (denne.getNeste() != null) {
			
		if(denne.getElement().getFilmskaper().contains(delstreng)) {
				bibli[antallFilmer] = denne.getElement();
				antallFilmer++;
			}
			denne = denne.getNeste();
		}
		return bibli;
	}
	@Override
	public int antall(Sjanger sjanger) {
		int antallFilmer = 0;
		LinearNode<Film> denne = start;
		
		for (int i=0; i < antall; i++) {
			if(sjanger == denne.getElement().getSjanger()) {
				antallFilmer++;
				i++;
			}
		}
		return antallFilmer;
	}
	@Override
	public int antall() {
		int antallFilmer = 0;
		LinearNode<Film> denne = start;
		
		for(int i = 0; i < antall; i++) {
			if(denne.getNeste().getElement() != null) {
				antallFilmer++;
				i++;
			}
		}
		return antallFilmer;
	}
	
	
}
