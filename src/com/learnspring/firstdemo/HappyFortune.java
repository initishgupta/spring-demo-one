package com.learnspring.firstdemo;

import java.util.Random;

public class HappyFortune implements FortuneService {

	private String[] todaysFortune = {"Lucky", "love", "Medium"};
	private Random rand = new Random();
	
	private int randInt() {
		int min = 0;
		int max = 2;
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	@Override
	public String getFortune() {
		return "Today is your "+ todaysFortune[randInt()]+" day!";
	}

}
