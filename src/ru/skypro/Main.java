package ru.skypro;

public class Main {

    public static void main(String[] args) {

       float firstBoxer = 78.2f;
       float secondBoxer = 82.7f;

       float sumBoxers = firstBoxer + secondBoxer;
       float weightDifference = secondBoxer % firstBoxer ;
       System.out.println("Общий вес двух бойцов = " + sumBoxers);
       System.out.println("Разница между весами бойцов = " + weightDifference);
    }
}
