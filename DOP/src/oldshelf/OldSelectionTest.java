package oldshelf;
import static org.junit.Assert.*;

import org.junit.Test;  

public class OldSelectionTest {
    @Test
    public void testgetAgeOrTitle(){
        Comic ct= new Comic("Tinkle", 10);
        assertEquals(ct.getTitle(), OldSelection.getAgeOrTitle(ct));
    }
}

//TODO: need to figure out how to add .jar files
