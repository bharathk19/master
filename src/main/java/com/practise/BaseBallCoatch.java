package com.practise;

public class BaseBallCoatch implements Coatch{

    private  FortuneService fortuneService;

    public BaseBallCoatch(FortuneService thefortuneService)
    {
        fortuneService=thefortuneService;
    }
    public String DailyWorkout() {
        return "Spend 30 min on bowling practise";
    }

    public String DailyFortune() {
        return fortuneService.getFortune();
    }
}
