package main;

public class Film {

	private int filmnr;
	private String filmskaper;
	private String tittel;
	private int lanseringsår;
	private Sjanger sjanger;
	private String filmselskap;
	
	public Film() {
		
	}
	
	public Film(int filmnr, String filmskaper, String tittel, int lanseringsår, Sjanger sjanger, String filmselskap) {
		this.filmnr=filmnr;
		this.filmskaper=filmskaper;
		this.tittel=tittel;
		this.lanseringsår=lanseringsår;
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

	public int getLanseringsår() {
		return lanseringsår;
	}

	public void setLanseringsår(int lanseringsår) {
		this.lanseringsår = lanseringsår;
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
                "\nLansert: " + lanseringsår + 
                "\nFilmskaper: " + filmskaper + 
                "\nFilmselskap: " + filmselskap;
    }
}

