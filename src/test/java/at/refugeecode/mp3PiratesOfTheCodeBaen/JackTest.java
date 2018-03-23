package at.refugeecode.mp3PiratesOfTheCodeBaen;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackTest {

    @Autowired
    Jack jack;

    @org.junit.jupiter.api.Test
    void findCoin() {

        assertEquals("My Coin",jack.findCoin());
    }
}