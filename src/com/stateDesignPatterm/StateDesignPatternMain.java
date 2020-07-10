package com.stateDesignPatterm;

//import java.util.Calendar;

public class StateDesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Se450Date date = new Se450Date();
//		Calendar cal = Calendar.getInstance();
//		
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		for(int i = 0; i < 7; i++) {
			//call methods on dates
			date.printDayOfWeek();
			date.printDate();
			date.doIHaveWorkToday();
			date.addDate();
		}
	}

}
