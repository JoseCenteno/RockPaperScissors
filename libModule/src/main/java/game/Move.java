package game;

import utils.Cons;

/**
 * The Class Move.
 */
public class Move {

	/** The Figure 1. */
	private Figure figure1;

	/** The Figure 2. */
	private Figure figure2;

	/** The winner. */
	private Integer winner;

	
	
	/**
	 * Gets the figure 1.
	 *
	 * @return the figure 1
	 */
	public Figure getFigure1() {
		return this.figure1;
	}



	/**
	 * Gets the figure 2.
	 *
	 * @return the figure 2
	 */
	public Figure getFigure2() {
		return this.figure2;
	}



	/**
	 * Gets the winner.
	 *
	 * @return the winner
	 */
	public Integer getWinner() {
		return this.winner;
	}



	/**
	 * Go.
	 */
	public void go() {
		//Figure 1 random
		this.figure1 = new Figure();
		//Figure 2 always Rock
		this.figure2 = new Figure(Cons.INDEX_ROCK);
		//Get the winner
		if (figure1.draw(figure2)) {
			this.winner = 0;
		} else if (figure1.winTo(figure2)) {
			this.winner = 1;
		} else
			this.winner = 2;
	}
	
	
}
