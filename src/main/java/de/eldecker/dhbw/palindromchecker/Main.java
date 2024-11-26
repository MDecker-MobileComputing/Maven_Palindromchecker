package de.eldecker.dhbw.palindromchecker;

import static de.eldecker.dhbw.palindromchecker.PalindromChecker.istPalindrom;


/**
 * Klasse mit {@code main}-Methode, zum Test der Klasse {@link PalindromChecker}.
 */
public class Main {


    /**
     * Einstiegsmethode für Palindromcheck.
     * <br><br>
     *
    * Die möglichen Programmabbruch-Statuscodes:
    * <ul>
    * <li>0: Das Programm wurde erfolgreich beendet.</li>
    * <li>1: Das Programm wurde mit einer falschen Anzahl von Argumenten aufgerufen.</li>
    * <li>2: Während des Palindrom-Checks ist eine Ausnahme aufgetreten.</li>
    * </ul>
     *
     * @param args String, der auf Palindromeigenschaft überprüft wird
     *             (genau ein Wort, sonst Programmabbruch)
     */
    public static void main( String[] args ) {

        if ( args.length != 1 ) {

            System.out.println( "\nFEHLER: Programm nicht mit genau einem Argument aufgerufen\n" );
            System.exit( 1 );
        }

        try {

            boolean ergebnis = istPalindrom( args[0] );

            String ergebnisStr = ergebnis ? "EIN" : "KEIN";

            String str = String.format( "\nDas Wort \"%s\" ist %s Palindrom.\n", args[0], ergebnisStr );
            System.out.println( str );

        } catch ( PalindromCheckerException ex ) {

            System.out.println( "\nFEHLER: Exception waehrend Palindrom-Check: " + ex.getMessage() );
            System.exit( 2 );
        }
    }

}
