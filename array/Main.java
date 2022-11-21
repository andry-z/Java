package com.company.andrea;

public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        int numero;
        for(int i = 0; i < size; i++){
            numero = genera();
            while(numero % 2 == 0){
                numero = genera();
            }
            array[i] = numero;
            System.out.println(array[i]);
        }
        int counter = 1;
        for(int i = 0; i < 5; i++){
            array[counter] = array[counter-1] + array[counter];
            counter = counter + 2;
        }
        System.out.println("\n");
        for(int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }

    private static int genera() {
        int min = 10;
        int range = 90;
        int rand;
        rand = (int)(Math.random() * range) + min;
        return rand;
    }
}
