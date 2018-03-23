package at.refugeecode.mp3PiratesOfTheCodeBaen;

import org.springframework.stereotype.Component;

@Component
public class Compass {
    private  CursedCoin cursedCoin;

    public Compass(CursedCoin cursedCoin) {
        this.cursedCoin = cursedCoin;
    }

    public String findCoin(){
        return cursedCoin.getCoin();
    }

}
