package com.practiseActivity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClass {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("NewAppContext.xml");
        context.refresh();
        Coach coach=context.getBean("myTrack",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

}
