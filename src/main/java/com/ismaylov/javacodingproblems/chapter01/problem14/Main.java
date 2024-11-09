package com.ismaylov.javacodingproblems.chapter01.problem14;

import com.ismaylov.javacodingproblems.chapter01.problem14.Ints;
import org.apache.bcel.Repository;
import org.apache.bcel.classfile.JavaClass;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        System.out.println("JDK 11 bytecode of Strings#intToStringV1()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("com.ismaylov.javacodingproblems.chapter01.problem14.Ints");
            System.out.println(objectClazz.getMethod(Ints.class.getMethod(
                    "intToStringV1")).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(com.ismaylov.javacodingproblems.chapter01.problem14.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("JDK 11 bytecode of Strings#intToStringV1()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("com.ismaylov.javacodingproblems.chapter01.problem14.Ints");
            System.out.println(objectClazz.getMethod(Ints.class.getMethod(
                    "intToStringV2")).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(com.ismaylov.javacodingproblems.chapter01.problem14.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("JDK 11 bytecode of Strings#intToStringV1()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("com.ismaylov.javacodingproblems.chapter01.problem14.Ints");
            System.out.println(objectClazz.getMethod(Ints.class.getMethod(
                    "intToStringV3")).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(com.ismaylov.javacodingproblems.chapter01.problem14.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

        System.out.println("JDK 11 bytecode of Strings#intToStringV1()");
        System.out.println("-----------------------------------------------------------");
        try {
            JavaClass objectClazz = Repository.lookupClass("com.ismaylov.javacodingproblems.chapter01.problem14.Ints");
            System.out.println(objectClazz.getMethod(Ints.class.getMethod(
                    "intToStringV4")).getCode());
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(com.ismaylov.javacodingproblems.chapter01.problem14.Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("-----------------------------------------------------------");

    }

}
