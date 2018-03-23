package at.refugeecode.mp3PiratesOfTheCodeBaen;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitialClass {
    @Bean
    ApplicationRunner applicationRunner(Jack jack){
        return args -> {
            System.out.println(jack.findCoin());
        };
    }
}
