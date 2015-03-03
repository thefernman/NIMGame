/* File: Pile.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

import java.util.Random;

/**
 * Pile class for creating and maintaining a pile of marbles.
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public class Pile 
{

    //instance variables
    private Random generator; //Random number generator.
    private int amount; //Amount of marbles.
    
    /**
     * Pile constructor that initialize the amount of marbles in the pile.
     * Amount of marbles is a random number of marbles between 10 and 100.
     */
    public Pile()
    {
        //Sets amount of marbles to random number between 10 and 100
        generator = new Random();
        amount = generator.nextInt( 91 ) + 10;
    }
    
    /**
     * The getPile method. Accessor for returning the current number of marbles
     * in the pile.
     * @return Returns a int number of marbles currently in the pile.
     */
    public int getPile()
    {
        return amount; //Returns number of marbles.
    }
    
    /**
     * The removeMarbles() method. Mutator method and changes or removes a
     * received number of marbles from the pile.
     * @param remove Receives an int number of marbles to remove from the pile.
     */
    public void removeMarbles(int remove)
    {
        amount = amount - remove; //Removes number of marbles from pile.
    }

}//end of Pile.java class.
