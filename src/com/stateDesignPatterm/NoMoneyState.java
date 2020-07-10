package com.stateDesignPatterm;

public class NoMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(int amount, String productName) {
		// TODO Auto-generated method stub
		System.out.println(amount + "Rs has been inserted and " + productName + " has been selected...");
	}

	@Override
	public void dispenseProduct() {
		// TODO Auto-generated method stub
		System.out.println("Vending Machine cannot dispense product because money is not inserted and product is not selected...");
	}
	
}
