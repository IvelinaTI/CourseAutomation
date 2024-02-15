package Lesson07;

public class Exersice0701 {
    //Create a car by provided name / color / release year / horse power / second hand
    //• Create a car by provided name / color / second hand
    //• Create a car by provided name / color / release year / horse power
    //• Create a car by provided name / release year / horse power / second hand
    //• Create a car by provided nothing
    public static void main(String[] args) {

        Car myCar = new Car("toyota", "red", 2020, 100, true);
        {
            System.out.println(myCar.name + " " + myCar.colour + " " + myCar.releaseYear + " " + myCar.horsePower + " " + myCar.secondHandTick);
            System.out.println();
        }

        Car secondCar = new Car("Nissan", "blue", true);
        {
            System.out.println(secondCar.name + " " + secondCar.colour + " " + secondCar.secondHandTick);
        }

        Car thirdCar = new Car();
        {
            String word = thirdCar.getName();
            System.out.println(word);
        }

    }

}
