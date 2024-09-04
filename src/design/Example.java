package design;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException,
            IOException, ClassNotFoundException, CloneNotSupportedException {
        Samosa samosa1 =  Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2 =  Samosa.getSamosa();
        System.out.println(samosa2.hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());
        /*
         * 1. Reflection API to break singleton pattern
         *Solution: 1 -> if object is already there => throw exception from inside constructor
         * 2. Deserialization
         *  Solution: Read Resolve method implementation to resolve this issue of creating 2 instances
         * 3. Cloning
         *
         */
        Samosa s1 =  Samosa.getSamosa();
        System.out.println(s1.hashCode());
        //reflection api usage
//        Constructor<Samosa> constructor =  Samosa.class.getDeclaredConstructor();
//        //to make the accesibility
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());


// deserialization example
        Samosa samosa =  Samosa.getSamosa();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        objectOutputStream.writeObject(samosa);

        System.out.println("Serialization done!");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
        Samosa samosas = (Samosa) ois.readObject();
        System.out.println(samosas.hashCode());

        Samosa samosaClone = (Samosa)samosa.clone();
        System.out.println(samosaClone.hashCode());
    }
}
