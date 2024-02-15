package Lesson07;

public class Car {

    public String name;
    public String colour;
    public int releaseYear;
    public int horsePower;
    public boolean secondHandTick;

    public Car (){
       this.name = "N/A";
        this.colour = "N/A";
        this.releaseYear = -1;
        this.horsePower = -1;
        this.secondHandTick = false;
    }
    public String getName(){
        return this.name;
    }
    public String getColour () {
        return this.colour;
    }
    public int getReleaseYear () {
        return this.releaseYear;
    }
    public int getHorsePower () {
        return this.horsePower;
    }
    //Create a car by provided name / color / release year / horse power / second hand
    //• Create a car by provided name / color / second hand
    //• Create a car by provided name / color / release year / horse power
    //• Create a car by provided name / release year / horse power / second hand
    //• Create a car by provided nothing
    public Car (String name,String colour, int releaseYear, int horsePower, boolean secondHandTick) {
        this.name = name;
        this.colour = colour;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }
    public Car (String name, String colour, boolean secondHandTick){
        this.name= name;
        this.colour = colour;
        this. secondHandTick = secondHandTick;
    }
    public Car (String name, String colour, int releaseYear, int horsePower) {
        this.name=name;
        this. colour = colour;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
    }
    public Car (String name, int releaseYear, int horsePower, boolean secondHandTick){
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

}
