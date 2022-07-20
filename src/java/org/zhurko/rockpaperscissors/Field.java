package org.zhurko.rockpaperscissors;

class Field {

    private Shape computerShape;
    private Shape playerShape;

    public Shape getComputerShape() {
        return computerShape;
    }

    public void setComputerShape(Shape computerShape) {
        this.computerShape = computerShape;
    }

    public Shape getPlayerShape() {
        return playerShape;
    }

    public void setPlayerShape(Shape playerShape) {
        this.playerShape = playerShape;
    }
}
