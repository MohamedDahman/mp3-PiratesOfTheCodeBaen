package at.refugeecode.mp3PiratesOfTheCodeBaen;

import org.springframework.stereotype.Component;

@Component
public class Jack {
    private Compass compass;


    public Jack(Compass compass) {
        this.compass = compass;
    }


    public String findCoin() {
        return compass.findCoin();
    }
}
