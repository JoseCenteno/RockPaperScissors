package game;

import java.util.ArrayList;
import java.util.List;

public class Match {
	
	/** The lst move. */
	private List<Move> lstMove;

	/** The Iterations. */
	private int Iterations = 100;


	/** The wins player 1. */
	private Integer winsPlayer1 = 0;
	
	/** The wins player 2. */
	private Integer winsPlayer2 = 0;
	
	/** The draw. */
	private Integer draw = 0;	
		

	/**
	 * Play.
	 */
	public void Play() {
		lstMove = new ArrayList<Move>();

		for (int i = 0; i < this.Iterations; i++) {

			Move move = new Move();

			move.go();

			switch (move.getWinner()) {
			case 0:
				draw += 1;
				break;
			case 1:
				winsPlayer1 += 1;
				break;
			case 2:
				winsPlayer2 += 1;
				break;
			}

			lstMove.add(move);
		}

	}




	/**
	 * Gets the lst move.
	 *
	 * @return the lst move
	 */
	public List<Move> getLstMove() {
		return lstMove;
	}
	




	/**
	 * Gets the iterations.
	 *
	 * @return the iterations
	 */
	public int getIterations() {
		return Iterations;
	}




	/**
	 * Gets the wins player 1.
	 *
	 * @return the wins player 1
	 */
	public Integer getWinsPlayer1() {
		return winsPlayer1;
	}




	/**
	 * Gets the wins player 2.
	 *
	 * @return the wins player 2
	 */
	public Integer getWinsPlayer2() {
		return winsPlayer2;
	}




	/**
	 * Gets the draw.
	 *
	 * @return the draw
	 */
	public Integer getDraw() {
		return draw;
	}
}
