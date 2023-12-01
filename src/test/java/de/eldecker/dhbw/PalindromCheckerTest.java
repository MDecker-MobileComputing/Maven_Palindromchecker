package de.eldecker.dhbw;

import static de.eldecker.dhbw.palindromchecker.PalindromChecker.istPalindrom;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class PalindromCheckerTest {

    @Test
    void normalisierung() throws Exception {
                
        assertTrue( istPalindrom( "Otto"   ) );
        assertTrue( istPalindrom( "OTTO"   ) );
        assertTrue( istPalindrom( "oTTO"   ) );
        assertTrue( istPalindrom( "otto"   ) );
        assertTrue( istPalindrom( "otto  " ) );
        assertTrue( istPalindrom( " otto  ") );
        assertTrue( istPalindrom( "  otto" ) );
        assertTrue( istPalindrom(" oTto "  ) );        
    }
    
}
