import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    public void sound() {
        Dog dog = new Dog();
        String result = dog.sound("a dog barks.");
        assertEquals("a dog barks." , result);
    }
}