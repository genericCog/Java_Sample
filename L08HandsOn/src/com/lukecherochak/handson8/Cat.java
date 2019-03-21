package com.lukecherochak.handson8;

public class Cat implements Mammal{

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println("Meow!");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Cats can run at a top speed of 30 mph!");
    }

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cats eat mice.");
	}

}