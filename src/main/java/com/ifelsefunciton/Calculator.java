package com.ifelsefunciton;

public class Calculator {
    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        int bag=cal.calculatorUsingFactory(15,20,"Subract");
        System.out.println(bag);
    }

    private int calculatorUsingFactory(int a,int b,String operator)
    {
        Operation targetOperation= OperationFactory.getOperation(operator).orElseThrow(()->new IllegalArgumentException("Invalid Operator"));
        return targetOperation.apply(a,b);
    }
}
