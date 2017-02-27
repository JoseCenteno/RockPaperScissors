package game;

import java.util.ArrayList;
import java.util.List;

import utils.Cons;

public class Match {
	
	/** The lst move. */
	private List<Move> lstMove;

	/** The Iterations. */
	private int iterations;


	/** The wins player 1. */
	private Integer winsPlayer1;
	
	/** The wins player 2. */
	private Integer winsPlayer2;
	
	/** The draw. */
	private Integer draw;	
		
	
	/**
	 * Instantiates a new match.
	 */
	public Match() {
		//Initialization
		this.iterations = Cons.ITERATIONS;
		this.winsPlayer1 = 0;
		this.winsPlayer2 = 0;
		this.draw = 0;
		this.lstMove = new ArrayList<Move>();
			
	}
	/**
	 * Play.
	 */
	public void Play() {
		

		for (int i = 0; i < this.iterations; i++) {

			Move move = new Move();
			//Execute one move
			move.go();
			//Get winner player
			switch (move.getWinner()) {
			case 0:
				this.draw += 1;
				break;
			case 1:
				this.winsPlayer1 += 1;
				break;
			case 2:
				this.winsPlayer2 += 1;
				break;
			}
			// Add to the Move List	
			this.lstMove.add(move);
		}

	}




	/**
	 * Gets the lst move.
	 *
	 * @return the lst move
	 */
	public List<Move> getLstMove() {
		return this.lstMove;
	}
	




	/**
	 * Gets the iterations.
	 *
	 * @return the iterations
	 */
	public int getIterations() {
		return this.iterations;
	}




	/**
	 * Gets the wins player 1.
	 *
	 * @return the wins player 1
	 */
	public Integer getWinsPlayer1() {
		return this.winsPlayer1;
	}




	/**
	 * Gets the wins player 2.
	 *
	 * @return the wins player 2
	 */
	public Integer getWinsPlayer2() {
		return this.winsPlayer2;
	}




	/**
	 * Gets the draw.
	 *
	 * @return the draw
	 */
	public Integer getDraw() {
		return this.draw;
	}
}
