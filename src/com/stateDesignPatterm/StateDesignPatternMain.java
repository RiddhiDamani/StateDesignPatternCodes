package com.stateDesignPatterm;

public class StateDesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Se450Date date = new Se450Date();
		
		for(int i = 0; i < 7; i++) {
			//call methods on dates
			date.addDate();
		}
	}

}
