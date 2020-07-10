package com.stateDesignPatterm;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Se450Date {
	
	private Calendar cal;
	private IState currentState;
	private final IState weekendState = new WeekendState();
	private final IState weekdayState = new WeekDayState();
	
	public Se450Date() {
		cal = Calendar.getInstance();
		updateState();
	}
	
	// So, every time we add the date, the state will be updated
	public void addDate() {
		cal.add(Calendar.DATE, 1);
		updateState();
		
	}
	
	private void updateState() {
		 currentState = cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7 ? 
				 weekendState : weekdayState;
	}
	
	public void printDayOfWeek() {
		System.out.println(currentState.formatDayOfWeek(new SimpleDateFormat("EEEE").format(cal.getTime())));
	}
	
	public void printDate() {
		System.out.println(currentState.formatDate(cal.getTime().toString()));
	}
	
	public void doIHaveWorkToday() {
		System.out.println(currentState.doIHaveWorkTodayString());
	}


}
