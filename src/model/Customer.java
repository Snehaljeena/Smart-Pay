package model;

//Represents Customer Details


public class Customer{
    private final String name;
    private final int previousReading;
    private final int currentReading;
    
    public Customer(String name, int previousReading,int currentReading )
    {
        this.name=name;
        this.previousReading=previousReading;
        this.currentReading=currentReading;
    }

    public String getName(){
        return name;
    }
    public int getPreviousReading(){
        return  previousReading;
    }
    public int getCurrentReading(){
        return currentReading;
    }
    public int getConsumedUnits(){
        return currentReading-previousReading;
    }


}