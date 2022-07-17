package org.zhurko.rockpaperscissors;

import java.util.Scanner;

class Player {

    public Shape getShape() {
        String input;
        char choice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make you choice (r - rock, p - paper, s - scissors).");
        System.out.print("Enter letter: ");
        input = scanner.next();

        if (input.length() > 1) {
            getShape();
        }

        choice = input.charAt(0);
        switch (choice) {
            case (114):
                return Shape.ROCK;
            case (112):
                return Shape.PAPER;
            case (115):
                return Shape.SCISSORS;
        }

        return getShape();
    }
}
