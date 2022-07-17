package org.zhurko.rockpaperscissors;

class GameLogic {

    private final Field field = new Field();
    private final Player player = new Player();
    private final Computer computer = new Computer();

    public void runGame() {
        field.setPlayerShape(player.getShape());
        System.out.println("Player's choice: " + field.getPlayerShape());

        field.setComputerShape(computer.getShape());
        System.out.println("Computer's choice: " + field.getComputerShape());

        if (field.getComputerShape() == field.getPlayerShape()) {
            System.out.println("No winner.");
        } else {
            Shape winnerShape = determineWinnerShape(field.getComputerShape(), field.getPlayerShape());
            if (winnerShape == field.getPlayerShape()) {
                System.out.println("Player won!");
            } else {
                System.out.println("Computer won.");
            }
        }
        System.out.println("Game over. Goodbye!");
    }

    private Shape determineWinnerShape(Shape shapeOne, Shape shapeTwo) {

        switch (shapeOne) {
            case ROCK: {
                if (shapeTwo.equals(Shape.PAPER)) {return Shape.PAPER;}
                if (shapeTwo.equals(Shape.SCISSORS)) {return Shape.ROCK;}
            }
            case PAPER: {
                if (shapeTwo.equals(Shape.ROCK)) {return Shape.PAPER;}
                if (shapeTwo.equals(Shape.SCISSORS)) {return Shape.SCISSORS;}
            }
            case SCISSORS: {
                if (shapeTwo.equals(Shape.ROCK)) {return Shape.ROCK;}
                if (shapeTwo.equals(Shape.PAPER)) {return Shape.SCISSORS;}
            }
        }

        // code bellow should never be reached
        return null;
    }
}
