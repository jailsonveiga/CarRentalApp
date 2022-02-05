package com.careerdevs.Ui;

public class TestUi {
    public static void main(String[] args) {
        String userInput = UserInput.readString("Who are you?");
        // String userInput = new UserInput().readString("Who are you?");
        // if we use non-static in UserInput.java we have to add the instance to use this
        System.out.println(userInput);

        int input = UserInput.readInt("Enter a number?");
        System.out.println(input);
    }
}
