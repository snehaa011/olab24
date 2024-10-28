package oldshelf;
import static org.junit.Assert.*;

import org.junit.Test;  

public class OldSelectionTest {
    @Test
    public void testgetAgeOrTitleForComic(){
        Comic ct= new Comic("Tinkle", 10);
        assertEquals("Tinkle", OldSelection.getAgeOrTitle(ct));
    }
    
    @Test
    public void testgetAgeOrTitleForString() {
    	String s = "Hello";
    	assertEquals("",OldSelection.getAgeOrTitle(s));
    }
}
