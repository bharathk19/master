package com.practise;

import java.security.PrivateKey;

public class CricketCoatch implements Coatch {
    private  FortuneService fortuneService;

    public CricketCoatch(FortuneService thefortuneService)
    {
        fortuneService=thefortuneService;
    }

    public String DailyWorkout() {
        return "Spend 30 min on batting practise";
    }

    public String DailyFortune() {
        return fortuneService.getFortune();
    }
}
