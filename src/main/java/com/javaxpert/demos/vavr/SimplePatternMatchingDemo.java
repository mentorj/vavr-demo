package com.javaxpert.demos.vavr;

import static io.vavr.API.*;

public class SimplePatternMatchingDemo {
    public static void main(String[] args){
        String result = Match(args.length).of(
                Case($(0),"Pas d'arguments passes au main..."),
                Case($(1), "Argument "+ args[0] + " passe au main"),
                Case($(),"Trop d'arguments "+ args.length)
        );
        System.out.println("EValudation des arguments aboutit a : "+ result);
    }
}
