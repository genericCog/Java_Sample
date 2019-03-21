package com.lukecherochak.handson8;

public class Dog implements Mammal{
	 @Override
	    public void speak() {
	        // TODO Auto-generated method stub
	        System.out.println("Bark!");
	    }

	    @Override
	    public void run() {
	        // TODO Auto-generated method stub
	        System.out.println("Dogs can run at a top speed of 45 mph!");
	    }

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("Dogs eat bones");
		}
}
