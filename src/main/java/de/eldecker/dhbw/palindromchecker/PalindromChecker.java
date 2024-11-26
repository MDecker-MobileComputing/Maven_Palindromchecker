package de.eldecker.dhbw.palindromchecker;


/**
 * Klasse mit Methode zur Durchführung von Palindromchecks.
 */
public class PalindromChecker {

    /**
     * String {@code palindrom} daraufhin überprüfen, ob es sich um ein Wortpalindrom (z.B. "Otto") handelt.
     * Die Groß-/Kleinschreibung wird hierbei ignoriert.
     *
     * @param palindrom String, der auf Palindromeigenschaft überprüft wird
     *
     * @return {@code true} gdw. Argument {@code palindrom} ein Palindrom ist
     *
     * @throws PalindromCheckerException Argument {@code palindrom} ist {@code null} oder ein leerer String
     */
    public static boolean istPalindrom( String palindrom ) throws PalindromCheckerException {

        if ( palindrom == null ) {

            throw new PalindromCheckerException( ">null< als String für Palindromcheck übergeben" );
        }

        final String palindromNormalized = palindrom.trim().toUpperCase();
        if ( palindromNormalized.isEmpty() ) {

            throw new PalindromCheckerException( "Leeren String für Palindromcheck übergeben" );
        }

        final int laenge           = palindromNormalized.length();
        final int anzahlVergleiche = laenge / 2; // int-Division, deshalb wird evtl. Nachkommastelle .5 abgeschnitten

        for ( int i = 0; i < anzahlVergleiche; i++ ) {

            int indexLinks  = i;
            int indexRechts = laenge - i - 1;

            char zeichenLinks  = palindromNormalized.charAt( indexLinks  );
            char zeichenRechts = palindromNormalized.charAt( indexRechts );

            if ( zeichenLinks != zeichenRechts ) {

                return false;
            }
        }

        return true;
    }

}
