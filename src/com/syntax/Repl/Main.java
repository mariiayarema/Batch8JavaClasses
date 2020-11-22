package com.syntax.Repl;

class Main implements Functions  {

    static double result=0;
    @Override
    public double adding(double firstNumber, double secondNumber) {
        result=firstNumber+secondNumber;
        return result;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        result=firstNumber-secondNumber;
        return result;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        result=firstNumber*secondNumber;
        return result;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        result=firstNumber/secondNumber;
        return result;
    }

    @Override
    public void display(double result) {
        System.out.println("Result is ::: "+ result);
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.adding(100,20);
        main.display(result);
        main.subtracting(100,20);
        main.display(result);
        main.multiply(100,20);
        main.display(result);
        main.dividing(100,20);
        main.display(result);
    }
}



