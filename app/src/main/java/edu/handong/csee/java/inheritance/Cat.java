package edu.handong.csee.java.inheritance;
public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;;
        Animal dog = new Dog(); // to show polymorphism. 
        Animal monkey =new Monkey(); //to show polymorphism. 
        dog.testInstanceMethod(); //"The instance method in Dog"
        monkey.testInstanceMethod();// "The instance method in Monkey"
        Animal.testClassMethod();// "The static method in Animal"
        myAnimal.testInstanceMethod(); //"The instance method in Cat"
    }
}
