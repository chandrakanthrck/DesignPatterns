package design_patterns.singleton;
//SINGLETON
//goal: want to create one instance of this class
//Constructor has to be private because we do not want the constructor to
//be called over and over again which would result in creation of
//multiple objects of the same class
//so we can call these object using methods

//so basic steps of singleton pattern
//1. Constructor private
//2. Object create with the help of method
//3. Create field to store object is private


import java.io.Serializable;

//DRAWBACK: we have not taken threads environment into consideration.
public class Samosa implements Serializable {
    //using this for object creation inside getSamosa method
    private static Samosa samosa;
    //constructor
    private Samosa(){
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern");
        }
    }
    //method to use samosa
    //we will be using this method to get the instance of the class
    //here we are using static keyword cz we can call it like Samosa.getSamosa()
    //So that means that this method is associated to this class and without using the class you cannot call this method
    //lazy way of initializing singleton object
//    public static Samosa getSamosa(){
//        //object of this class
//        //Samosa samosa = new Samosa();
//        //but here is a problem, so every time some client calls this method
//        //it is going to create a new constructor. So what is the whole point of this?
//        //Solution: So every time the method gets called, it is going to check if the object is created or not
//        //DRAWBACK: If multiple threads are there, then this will be an issue
//        //if there are two threads, then both the threads will create 2 objects
//        //so if we have to use syncronized way of using the threads
//        if(samosa==null){
//            samosa = new Samosa();
//        }
//        return samosa;
//    }

    //SOLUTION:
    //so when we use synchronize this class, this method can be only accessed by one thread
    //then the problem would be that perhaps we do not want to make the entire class synchronized
    //so we cannot use method synchronization
//    public synchronized  static  Samosa getSamosa()
//    {
//        if(samosa == null){
//            samosa = new Samosa();
//        }
//        return samosa;
//    }

    public  static  Samosa getSamosa() {
        //object of this class
        if(samosa == null){
            //only this block of code is synchronized
            synchronized (Samosa.class){
                if(samosa==null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}
