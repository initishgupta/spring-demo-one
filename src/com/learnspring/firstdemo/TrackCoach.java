package com.learnspring.firstdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	//add an init method
	
	public void doMyStartUpStuff(){
		System.out.println("TrackCoach: Inside Method doMyStartUpStuff");
	}
	
	//add a destroy method
	public void doMyCleanUpStuff(){
		System.out.println("TrackCoach: Inside Method doMyCleanUpStuff");
	}
}
