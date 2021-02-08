package main;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int lanserings�r;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int lanserings�r, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.filmskaper=filmskaper;
		this.tittel=tittel;
		this.lanserings�r=lanserings�r;
		this.sjanger=sjanger;
		this.filmselskap=filmselskap;
	}
	
	public String getFilmselskap() {
		return filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}
	public int getFilmnr() {
		return filmnr;
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getLanserings�r() {
		return lanserings�r;
	}

	public void setLanserings�r(int lanserings�r) {
		this.lanserings�r = lanserings�r;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}
	
	public String toString() {
        return "[Filmnr: " + filmnr + 
                "\nTittel: " + tittel + 
                "\nSjanger: " + sjanger + 
                "\nLansert: " + lanserings�r + 
                "\nFilmskaper: " + filmskaper + 
                "\nFilmselskap: " + filmselskap;
    }
}

