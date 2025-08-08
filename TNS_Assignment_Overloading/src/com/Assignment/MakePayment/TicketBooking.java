package com.Assignment.MakePayment;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    public TicketBooking() {
    }

    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    public void makePayment(double amount, String creditCardType, String ccv) {
        System.out.printf("Amount %.1f paid using %s card\n", amount, creditCardType);
        System.out.printf("CCV:%s\n", ccv);
    }
}
