package de.eldecker.dhbw.palindromchecker;


/**
 * Eigene Exception-Klasse für Palindrom-Checker.
 */
@SuppressWarnings("serial")
public class PalindromCheckerException extends Exception {

	/**
	 * Konstruktor für neue Exception. 
	 * 
	 * @param message Beschreibung Fehler
	 */
    public PalindromCheckerException( String message ) {

        super( message );
    }
}
