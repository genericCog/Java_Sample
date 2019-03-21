package com.lukecherochak.handson8;

public class Cow implements Mammal{

    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println("Moo!");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Cows can run at a top speed of 25 mph!");
    }

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cows eat grass");
	}

}