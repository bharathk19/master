package com.practise;

import java.security.PrivateKey;

public class CricketCoatch implements Coatch {
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    private String emailAddress;
    private String team;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private  FortuneService fortuneService;
    public CricketCoatch()
    {
        System.out.println("No Arg constructor");
    }
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
