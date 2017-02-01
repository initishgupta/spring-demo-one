package com.learnspring.firstdemo;

import java.util.Random;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		//Coach baseballCoach = new TrackCoach();
//		// use the object
		//System.out.println(baseballCoach.getDailyWorkout());
			Random rand = new Random();
			int min = 0;
			int max = 3;
		    //rand = null;
		    int randomNum = rand.nextInt((max - min) + 1) + min;
		    System.out.println(randomNum);
		    
		    System.out.println("FIRST CHANGE");
		    System.out.println("Second Change");
		    System.out.println("FIRST CHANGE");
		    
		}
	}

