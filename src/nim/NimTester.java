/* File: NimTester.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)
 
 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import javax.swing.JOptionPane;

/**
 * Nim is an ancient game where two players takes turns removing marbles from a
 * pile. On each turn, the player must remove at least one but no more than half
 * of the remaining marbles. The player who is forced to remove the last marble
 * loses. The game begins by asking the human whether she wants to go first or
 * second, and whether the computer should play in smart or stupid mode. In
 * stupid mode, the computer removes a random number of marbles between 1 and
 * n/2 each turn. In smart mode, the computer removes exactly enough marbles to
 * make the remaining pile a power of two minus one.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class NimTester {

    /**
     * This test class creates the players and the Nim game object. Then passes
     * the players to the Nim game's play method after some questions. Then 
     * game ask if you want to play again.
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Player array of player objects
        Player[] players = new Player[2];
        String again = null;

        do 
        {
            //Welcome
            JOptionPane.showMessageDialog(null, "Welcome to the game of NIM!");
            
            //Ask if human would like to be first to play.
            String first = JOptionPane.showInputDialog
                ("Human, do you want to go first? \nType Yes or No.");
            //Ask if computer should play in Smart or Dumb Mode.
            String mode = JOptionPane.showInputDialog
                ("Computer mode: Type DUMB if you want "
                        + "to play in the DUMB mode, "
                        + "\nor type SMART if you want to play in "
                        + "the SMART mode.");
            
            //Depending on above inputs, creates players and adds to array.
            if (first.equalsIgnoreCase("Yes") && mode.equalsIgnoreCase("SMART")) 
            {
                players[0] = new HumanPlayer();
                players[1] = new SmartComputer();
            }
            
            if (first.equalsIgnoreCase("Yes") && mode.equalsIgnoreCase("DUMB")) 
            {
                players[0] = new HumanPlayer();
                players[1] = new DumbComputer();
            }
             
            if (first.equalsIgnoreCase("No") && mode.equalsIgnoreCase("SMART")) 
            {
                players[0] = new SmartComputer();
                players[1] = new HumanPlayer();
            }
            
            if (first.equalsIgnoreCase("No") && mode.equalsIgnoreCase("DUMB")) 
            {
                players[0] = new DumbComputer();
                players[1] = new HumanPlayer();
            }
            
            //Output of players going to play Nim.
            JOptionPane.showMessageDialog(null, "This NIM game will be "
                    + players[0] + " vs " + players[1]);
            
            //Creates Nim object and calls the play() from Nim object.
            Nim game = new Nim();
            game.play(players);

            //Ask if you want to play again.
            again = JOptionPane.showInputDialog
                ("Would you like to play again? \nType Yes or No.");

        } while (again.equalsIgnoreCase("Yes")); //do loop while true

    }//end of main method.

}//End of NimTester.java class
