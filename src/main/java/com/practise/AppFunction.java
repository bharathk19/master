package com.practise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFunction {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.refresh();
        CricketCoatch coatch=context.getBean("mycoach",CricketCoatch.class);
        System.out.println(coatch.DailyWorkout());
        System.out.println(coatch.DailyFortune());
        System.out.println(coatch.getEmailAddress());
        System.out.println(coatch.getTeam());
        context.close();
    }
}
