/* File: Player.java
 I affirm that this program is entirely my own work and 
 none of it is the work of any other person.

 ___________________
 (your signature)

 Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm

 */
package nim;

/**
 * Player interface that will declare a move().
 * @author Fernando Campo 1299228 Programming II COP 3337 TuTh 5pm-6:15pm
 */
public interface Player {

    /**
     * The move() method from which players will return the number of marbles
     * to be removed. Receives the number of marbles in pile, and then returns
     * the number of marbles to be removed from pile from which method was
     * called.
     * @param marblesInPile Received the number of marbles in the current pile.
     * @return Returns int number of marbles to be removed.
     */
    int move(int marblesInPile);

}//end of Player.java interface.
