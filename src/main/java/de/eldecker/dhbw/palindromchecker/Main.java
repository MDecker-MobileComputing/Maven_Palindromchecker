package de.eldecker.dhbw.palindromchecker;

import static de.eldecker.dhbw.palindromchecker.PalindromChecker.istPalindrom;


/**
 * Klasse mit {@code main}-Methode, zum Test der Klasse {@link PalindromChecker}. 
 */
public class Main {
    

    /**
     * Einstiegsmethode für Palindromcheck.
     * 
     * @param args String, der auf Palindromeigenschaft überprüft wird
     *             (genau ein Wort, sonst Programmabbruch)
     */
    public static void main(String[] args) {
                
        if (args.length != 1) {
            
            System.out.println("\nFEHLER: Programm nicht mit genau einem Argument aufgerufen\n");
            System.exit(1);
        }
        
        try {
            
            boolean ergebnis = istPalindrom(args[0]);
            
            String ergebnisStr = ergebnis ? "EIN" : "KEIN";
            
            String str = String.format("\nDas Wort \"%s\" ist %s Palindrom.\n", args[0], ergebnisStr);
            System.out.println(str);
            
        } catch (PalindromCheckerException e) {
            
            System.out.println("\nFEHLER: Exception waehrend Palindrom-Check: " + e.getMessage());
            System.exit(2);
        }        
    }
}
