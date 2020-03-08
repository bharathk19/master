package com.practiseActivity;

import java.util.Arrays;
import java.util.Random;

public class BasicFortune implements FortuneService{
    public String getDailyFortune() {
        String[] fortune={"Have a good day","you will be the winner","your day will be awesome"};
        Random random=new Random();
        int index = random.nextInt(fortune.length);
       // for(int i=0;i<fortune.length;i++)
       // {
         //   index= (int) (Math.random()*10);
        //}

        return (fortune[index]);
    }
}
