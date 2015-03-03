/* File: SmartComputer.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import java.util.Random;

/**
 * SmartComputer class that implements the Player interface.
 *
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class SmartComputer implements Player 
{

    /**
     * SmartComputer constructor from which to create SmartComputer objects.
     * Removes exactly enough marbles to make the remaining pile a power of 
     * two minus one (1, 3, 7, 15, 31, or 63).
     */

    public SmartComputer() 
    {

    }

    /**
     * Overriding the toString method of Object class.
     *
     * @return Returns the string value for this class.
     */
    @Override
    public String toString() 
    {
        return "Smart Computer";
    }

    @Override //Overriden method from Player interface
    public int move(int marblesInPile) 
    {
        int marblesRemoved;//initializing marblesRemoved varible.
        //If marblesInPile received is already a power of 2 minus 1, generate
        //a random number of marbles to remove. You can't remove a number
        //of marbles to make it a power of 2 minus 1 less than or equal to half
        //the marbles in the pile.
        if ((marblesInPile+1 & (marblesInPile)) == 0) //bitwise AND
        {
            Random generator = new Random();
            marblesRemoved = generator.nextInt(marblesInPile / 2) + 1;
        }
        //if its not already a power of 2 minus 1, remove some number of
        //marbles to make the pile a power of 2 minus 1. This code finds the
        //highest power of 2 minus 1 less than half the pile and uses that to
        //find the number of marbles to remove from pile to make pile a power
        //of 2 minus 1.
        else 
        {
            int power = 2;
            while (power - 1 < marblesInPile/2) 
            {
                power *= 2;
            }
            int remove = power - 1;
            marblesRemoved = marblesInPile - remove;
        }

        return marblesRemoved;
    }
}//end of SmartComputer.java class.
