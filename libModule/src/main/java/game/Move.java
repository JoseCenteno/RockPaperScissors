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
		return figure1;
	}



	/**
	 * Gets the figure 2.
	 *
	 * @return the figure 2
	 */
	public Figure getFigure2() {
		return figure2;
	}



	/**
	 * Gets the winner.
	 *
	 * @return the winner
	 */
	public Integer getWinner() {
		return winner;
	}



	/**
	 * Go.
	 */
	public void go() {
		figure1 = new Figure();

		figure2 = new Figure(Cons.INDEX_ROCK);

		if (figure1.draw(figure2)) {
			winner = 0;
		} else if (figure1.winTo(figure2)) {
			winner = 1;
		} else
			winner = 2;
	}
	
	
}
