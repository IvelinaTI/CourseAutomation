package Automation_AQ;

public class Exercise4 {
    public static void main(String[] args) {

        int height= 10;

        // for цикъла - задаваме начало, условие за да има повторение, промяна
        // в къдравите скоби слагаме действието,което ще се извърши
        for (int i =1; i <=height; i++ ) {

            //принтиането на празно място
            for (int space=1; space<=height - i ; space++) {
                System.out.print(" ");
            }

            //Принтиране на звездичките
            for (int stars = 1; stars <= i*2 -1; stars++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
