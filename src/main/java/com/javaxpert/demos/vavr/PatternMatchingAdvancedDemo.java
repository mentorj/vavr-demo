package com.javaxpert.demos.vavr;

import java.util.Scanner;
import static io.vavr.API.*;
/**
 * A simple pattern matching demo
 */
public class PatternMatchingAdvancedDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre au clavier:");
        int number = scanner.nextInt();
        String result = Match(number).of(
                Case($((Integer x)->(x%3==0 && x%5==0)),"GringMunck"),
                Case($((Integer x) -> (x.intValue() %3 ==0)),"Gring"),
                Case($((Integer x)-> (x%5==0)),"Munck"),
                Case($(),"Je ne sais pas !! AUtre chose..")

        );
        System.out.println("Votre nombre est qualifiable de : "+ result);
    }
}