package com.practise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppFunction {
    public static void main(String args[])
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.refresh();
        Coatch coatch=context.getBean("mycoach",Coatch.class);
        System.out.println(coatch.DailyWorkout());
        context.close();
    }
}
