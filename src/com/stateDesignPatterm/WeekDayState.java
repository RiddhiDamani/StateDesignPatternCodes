package com.stateDesignPatterm;

public class WeekDayState implements IState {

	@Override
	public String formatDayOfWeek(String dayOfWeek) {
		
		return dayOfWeek.toLowerCase();
	}

	@Override
	public String formatDate(String date) {
		
		return date;
	}

	@Override
	public String doIHaveWorkTodayString() {
		
		return "YES";
	}
	
}
