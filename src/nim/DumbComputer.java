/* File: DumbComputer.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import java.util.Random;

/**
 * DumbComputer class that implements the Player interface.
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class DumbComputer implements Player 
{

    /**
     * DumbComputer constructor from which to create DumbComputer objects. 
     */
    public DumbComputer() 
    {

    }

    /**
     * Overriding the toString method of Object class.
     * @return Returns the string value for this class.
     */
    @Override
    public String toString() 
    {
        return "Dumb Computer";
    }

    @Override
    public int move(int marblesInPile) 
    {
        Random generator = new Random();
        return generator.nextInt(marblesInPile / 2) + 1;
    }
}//end of DumbComputer.java class.
