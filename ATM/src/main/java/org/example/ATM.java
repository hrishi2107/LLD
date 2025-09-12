package org.example;

import org.example.ATMStates.IdleState;

public class ATM {
    ATMState state;
    Integer atmBalance;

    int noOfThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;


    ATM (){
        setCurrentState(new IdleState());
    }
    public void setCurrentState(ATMState state)
    {
        this.state = state;
    }

    public ATMState getState() {
        return state;
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public Integer getAtmBalance() {
        return atmBalance;
    }

    public void setAtmBalance(Integer atmBalance) {
        this.atmBalance = atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfThousandNotes = noOfThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfThousandNotes() {
        return noOfThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductThousandNotes(int number) {
        noOfThousandNotes = noOfThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("1000Notes: " + noOfThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }


}
