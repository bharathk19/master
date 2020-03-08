package com.practiseActivity;

public class TrackCoach implements Coach {

    public TrackCoach(BasicFortune basicFortune) {
        this.basicFortune = basicFortune;
    }

    BasicFortune basicFortune;
    public String getDailyWorkout() {
        return "Run for 15 minutes";
    }

    public String getDailyFortune() {
        return basicFortune.getDailyFortune();
    }
}
