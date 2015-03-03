/* File: Nim.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import javax.swing.JOptionPane;

/**
 * Nim class that contains the play() from which game runs from.
 * Nim is an ancient game where two players takes turns removing marbles from a
 * pile. On each turn, the player must remove at least one but no more than half
 * of the remaining marbles. The player who is forced to remove the last marble
 * loses. The game begins by asking the human whether she wants to go first or
 * second, and whether the computer should play in smart or stupid mode. In
 * stupid mode, the computer removes a random number of marbles between 1 and
 * n/2 each turn. In smart mode, the computer removes exactly enough marbles to
 * make the remaining pile a power of two minus one.
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Nim 
{

    //instance variables 
    private Pile pile; // Pile of marbles object

    /**
     * Nim constructor from which to create Nim objects.
     */
    public Nim() 
    {
        pile = new Pile();
    }

    /**
     * Play method receives the players array of type Player and conducts the
     * game. While the pile is greater than 1, pass the number of marbles to
     * the Player move(). The play() method call the move() method 
     * polymorphically. Returns the number of marbles to remove and removes
     * them from the pile for each player till the pile of marbles reaches 1, 
     * and the winner is declared.
     * @param players Player array of players who are playing the game.
     */
    public void play(Player[] players) 
    {
        //while pile is greater than 1, conduct the game.
        while (pile.getPile() > 1) 
        {
            //iterate over players array.
            for (int i = 0; i < players.length; i++) 
            {
                //Remove is the return number of marbles to remove from pile.
                int remove = players[i].move(pile.getPile());
                //Passes remove to the removeMarbles() of the pile object.
                pile.removeMarbles(remove);
                //Comfirmation of player move and the new amount of marbles.
                JOptionPane.showMessageDialog(null, players[i] + " has removed "
                        + remove + " marbles.\n There are now "
                        + pile.getPile() + " marbles left.");

                //Check if theres only one marbles after the remove 
                //to declare the winner
                if (pile.getPile() == 1) 
                {
                    JOptionPane.showMessageDialog
                        (null,"Other player picks up last marble!\n"
                            + players[i] + " wins!");
                    break;
                }
            }//end of for loop
        }//end of while loop
    }//end of play()
}//end of Nim.java class
