package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 20;
        int temperature = 30;

        System.out.println(addition(age, temperature));
    }

    public static String addition(int age, int temperature) {
        if (age > 20 && age < 40 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

}

