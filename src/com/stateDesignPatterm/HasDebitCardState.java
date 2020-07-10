package com.stateDesignPatterm;

public class HasDebitCardState implements AtmMachineState {

	@Override
	public void insertDebitCard() {
		// TODO Auto-generated method stub
		System.out.println("Debit card is already inserted, so you cannot insert it again..");
	}

	@Override
	public void ejectDebitCard() {
		// TODO Auto-generated method stub
		System.out.println("Debit Card is ejected..");
	}

	@Override
	public void enterPinAndWithdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Pin number has been entered correctly and money has been withdrawn..");
	}

}
