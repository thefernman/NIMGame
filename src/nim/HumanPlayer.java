/* File: HumanPlayer.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import javax.swing.JOptionPane;

/**
 * HumanPlayer class that implements the Player interface.
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class HumanPlayer implements Player 
{

    /**
     * HumanPlayer constructor from which to create HumanPlayer objects.
     */
    public HumanPlayer() 
    {

    }

    /**
     * Overriding the toString method of Object class.
     * @return Returns the string value for this class.
     */
    @Override
    public String toString() 
    {
        return "Human Player";
    }

    @Override //Overriden method from Player interface
    public int move(int marblesInPile) 
    {
        //Ask user for number of marbles to remove.
        String input = JOptionPane.showInputDialog
        (this + ", there is " + marblesInPile + " in the pile."
                + " How many to you want to remove?");
        
        //Assigns input to marblesRemoved.
        int marblesRemoved = Integer.parseInt(input);
        
        //Input error: If marblesRemoved is less than 1 or greater than half
        //the marbles in the pile, request input again.
        while (marblesRemoved < 1 || marblesRemoved > (marblesInPile / 2)) 
        {
            input = JOptionPane.showInputDialog
            ("Not a valid number of marbles to remove. Please try again.\n"
                    + "There is " + marblesInPile + " in the pile." +
                " How many marbles do you want to remove?");
            marblesRemoved = Integer.parseInt(input);
        }
        return marblesRemoved; //return marbles to be removed from pile.
    }//end of move() method.

}//end of HumanPlayer.java class
