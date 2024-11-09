package com.ismaylov.javacodingproblems;

import java.util.function.BiPredicate;

public class BiPredicateExemplification {

    public static void main(String[] args) {

        BiPredicate<Object, Object> biPredicate = Object::equals;

    }
}