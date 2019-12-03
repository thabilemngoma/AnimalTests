import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
   public void eat() {
        Animal animal = new Animal();
        String result = animal.eat("Food");
        assertEquals("Food", result);
    }
}