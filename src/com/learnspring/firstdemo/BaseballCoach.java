package com.learnspring.firstdemo;

public class BaseballCoach implements Coach {
	//define a private field
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {

		return "Spend 30 minutes on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortuneservice
		return fortuneService.getFortune();
	}
}
