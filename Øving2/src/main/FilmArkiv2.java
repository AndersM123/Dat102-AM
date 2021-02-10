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
		Film [] tab = new Film[antall];
		LinearNode<Film> check = start;
		
		for(int i = 0; i < antall; i++) {
			tab[i] = check.getElement();
			check = check.getNeste();
		}
		return tab;
	}
	
	
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
	
	
	@Override
	public boolean slettFilm(int filmnr) {
		boolean funnet = false;
		LinearNode<Film> forrige = null;
		LinearNode<Film> p = start;	
		
		if(p.getElement().getFilmnr() == filmnr) {
			start = p.getNeste();
			funnet = true;
		}
		
		for (int søk = 0; søk < antall && !funnet; søk++) {
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
			}
		}
		return antallFilmer;
	}
	@Override
	public int antall() {
		return antall;
	}
	
	
}
