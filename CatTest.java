import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void CatSoundTest(){
        Cat cat = new Cat();
        String result = cat.sound("a cat meows.");
        assertEquals("a cat meows." , result);
    }
}