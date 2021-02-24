package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println(addition(generateRandomAge(), generateRandomTemperature()));
        System.out.println(addition(generateRandomAge(), generateRandomTemperature()));
        System.out.println(addition(generateRandomAge(), generateRandomTemperature()));
        System.out.println(addition(generateRandomAge(), generateRandomTemperature()));
        System.out.println(addition(generateRandomAge(), generateRandomTemperature()));
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

    public static int generateRandomAge(){
       // return ThreadLocalRandom.current().nextInt(0, 75);
        ///return (int) (Math.random() * 75);
        return new Random().nextInt(75);
    }

    public static int generateRandomTemperature(){
        return ThreadLocalRandom.current().nextInt(-50, 75);
    }

}

