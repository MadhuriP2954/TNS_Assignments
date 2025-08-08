package com.tns.assInterface;
class KingFisher implements Airfare {
	private Integer hours;
    private Double costPerHour;
    // Default constructor
    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0.0;
    }
    // Parameterized constructor
    public KingFisher(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }// Getters and Setters
    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Double getCostPerHour() {
        return costPerHour;
    }
    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }
    // Calculate amount method
    @Override
    public Double calculateAmount() {
        return hours * costPerHour * 4; // Multiply by 4 for KingFisher
    }
 // Display method
    @Override
    public void display() {
        System.out.printf("%.2f%n", calculateAmount());
    }
}
