package de.eldecker.dhbw;

import static de.eldecker.dhbw.palindromchecker.PalindromChecker.istPalindrom;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import de.eldecker.dhbw.palindromchecker.PalindromChecker;
import de.eldecker.dhbw.palindromchecker.PalindromCheckerException;

/**
 * Unit-Tests für Methode {@link PalindromChecker#istPalindrom(String)}.
 */
public class PalindromCheckerTest {

    @Test
    void normalisierung() throws Exception {
                
        assertTrue( istPalindrom( "OTTO"   ) );
        assertTrue( istPalindrom( "oTTO"   ) );
        assertTrue( istPalindrom( "otto"   ) );
        assertTrue( istPalindrom( "otto  " ) );
        assertTrue( istPalindrom( " otto  ") );
        assertTrue( istPalindrom( "  otto" ) );
        assertTrue( istPalindrom(" oTto "  ) );        
    }
    
    @Test
    void palindromGeradzahligeLaenge() throws Exception {
    	
    	assertTrue( istPalindrom( "Otto"       ) );
    	assertTrue( istPalindrom( "Ebbe"       ) );
    	assertTrue( istPalindrom( "Renner"     ) );
    	assertTrue( istPalindrom( "Lagerregal" ) );
    }
    
    @Test
    void palindromUngeradezahligeLaenge() throws Exception {
    	
    	assertTrue( istPalindrom( "Aha"       ) );
    	assertTrue( istPalindrom( "Madam"     ) );
    	assertTrue( istPalindrom( "Deleveled" ) );
    }
    
    @Test
    void keinPalindrom() throws Exception {
    	
    	assertFalse( istPalindrom("abc"));    	
    	assertFalse( istPalindrom("axya"));
    }
    
    @Test
    void leererInput()  {
    	
    	try {
    		
    		istPalindrom(" ");
    		
    		fail("Keine Exception für leeren Eingabe-String geworfen.");
    	}
    	catch (PalindromCheckerException ex) {}
    }
    
}
