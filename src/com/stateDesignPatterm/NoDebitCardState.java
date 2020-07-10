package com.stateDesignPatterm;

public class NoDebitCardState implements AtmMachineState {

	@Override
	public void insertDebitCard() {
		System.out.println("Debit Card Inserted");
		
	}

	@Override
	public void ejectDebitCard() {
		// TODO Auto-generated method stub
		System.out.println("No Debit Card in ATM Machine slot, so you cannot eject the Debit Card..");
		
	}

	@Override
	public void enterPinAndWithdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("No Debit Card in ATM Machine slot, so you cannot enter the pin and withdraw the money..");
	}

}
