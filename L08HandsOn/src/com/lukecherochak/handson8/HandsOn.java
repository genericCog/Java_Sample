package com.lukecherochak.handson8;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal[] mammal = new Mammal[3];
		Reptile[] reptile = new Reptile[2];
		mammal[0] = new Dog();
		mammal[1] = new Cat();
		mammal[2] = new Cow();
		reptile[0] = new Turtle();
		reptile[1] = new Lizard();

        for (int i = 0; i < mammal.length; i++) {
        	mammal[i].speak();
        	mammal[i].run();
        	mammal[i].eat();
        }
        for (int i = 0; i < reptile.length; i++) {
        	reptile[i].crawl();
        	reptile[i].eat();
        }
	}
}
