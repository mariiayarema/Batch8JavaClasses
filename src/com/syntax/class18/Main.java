package com.syntax.class18;

public class Main {


      double sum(double[] array){
        double suma=0;
        for(int i=0; i<=array.length; i++){
            suma=suma+array[i];

        }
          return suma;
    }

    public static void main(String[] args) {
          Main main=new Main();
        main.sum(new double[]{1, 2, 3, 4, 5});
    }
}
