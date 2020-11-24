package sample;


import sample.Game;

public class Start {
    public static void main(String [] args) {
        sample.Game startGame = new Game(); // Step 1 - We create our object.
        startGame.play(); // Step 2 - We run the method play (); on the game object.
    }
}
