package com.paulcristea.xye.paulcristea;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice some squads!";
    }
}
