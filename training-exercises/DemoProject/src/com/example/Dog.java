package com.example;


public class Dog {

int legs=4;//Instance Variable

void eat()//Instance Method

{

	System.out.println("Eats Bones");

}

public static void main(String[] args) {

	Dog d=new Dog();

	System.out.println("Dog has "+d.legs+" legs");

	d.eat();

}

}