package com.ismaylov.javacodingproblems.chapter01.problem12;

public class TextBlockIsomorphic {

    public static void main(String[] args) {

        String s1 = """
                   abbcdd                   
                     baaaad
                   ccddaa
                   """;

        String s2 = """  
                   qwwerr
                     wqqqqr
                   eerrqq
                   """;

        boolean result = isIsomorphic(s1, s2);

        System.out.println("Is ismoporphic ? " + result);
    }

    //TODO: Write a program that checks if two text blocks are isomorphic.
    private static boolean isIsomorphic(String s1, String s2) {
        return false;
    }

}
