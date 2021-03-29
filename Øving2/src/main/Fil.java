package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import adt.FilmArkivADT;

public class Fil {
	    
	
	//Lese et Filmarkiv fra tekstfil
	public static FilmArkivADT lesFraFil (FilmArkivADT Filmarkiv, String filnavn) {
		//her var feilen
		FilmArkivADT filmarkiv = Filmarkiv;
		final String SKILLE = "#";
		final String Test_Fil = "testing.txt";
		
		FileReader testFil = null;
		BufferedReader innFil = null;
		
		
		try {
			testFil = new FileReader(Test_Fil);
			innFil = new BufferedReader(testFil);
		}
		catch(FileNotFoundException unntak) {
			System.out.println("Finner ikke filen " + Test_Fil);
			System.exit(1);
		}
		
		try {
			testFil = new FileReader(Test_Fil);
			
			String linje = innFil.readLine();
			int n = Integer.parseInt(linje);
			
			for (int i = 0; i < n; i++) {
				String post = innFil.readLine();
				String[] felt = post.split(SKILLE);
				int filmnr = Integer.parseInt(felt[0]);
				String filmskaper = felt[1];
				String tittel = felt[2];
				int lanseringsår = Integer.parseInt(felt[3]);
				Sjanger sjanger = Sjanger.valueOf(felt[4]);
				String filmselskap = felt[5];
				
				Film a = new Film(filmnr, filmskaper, tittel, lanseringsår, sjanger, filmselskap);
				System.out.println(a);
				//viktig
				filmarkiv.leggTilFIlm(a);
				
				post = innFil.readLine();
			}
			innFil.close();
		}
		catch (IOException e) {
			System.out.println("Feil ved lesing av fil: " + e);
			System.exit(2);
		}
		return filmarkiv;
		
	}
	
	//Lagre filmarkiv til teksfil
	public static void skrivTilFil(FilmArkivADT filmarkiv, String filmavn) {
		
		final String SKILLE = "#";
		final String Test_Fil = "testing.txt";
		
		Film LK = new Film(15, "Walt Disney", "Løvenes Konge", 1994, Sjanger.FANTASY, "Walt Disnet Animation Studios");
		
		int antall = 1;
		
		try {
			FileWriter testFil = new FileWriter(Test_Fil, false);
			
			PrintWriter utfil = new PrintWriter(testFil);
			
			utfil.println(antall);
			
			
			utfil.print(LK.getFilmnr()); utfil.print(SKILLE);
			utfil.print(LK.getFilmskaper()); utfil.print(SKILLE);
			utfil.print(LK.getTittel()); utfil.print(SKILLE);
			utfil.print(LK.getLanseringsår()); utfil.print(SKILLE);
			utfil.print(LK.getSjanger()); utfil.print(SKILLE);
			utfil.print(LK.getFilmselskap()); utfil.print(SKILLE);
			
			
		utfil.close();
		}
		catch (IOException e) {
			System.out.println("Feil ved skriving til fil : " + e);
			System.exit(3);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
