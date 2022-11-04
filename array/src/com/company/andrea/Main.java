package com.company.andrea;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random rand = new Random();
        int numero;
        for(int i = 0; i < size; i++){
            numero = rand.genera();
            while(numero % 2 == 0){
                numero = rand.genera();
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
}
