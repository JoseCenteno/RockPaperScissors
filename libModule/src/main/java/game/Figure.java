package game;

import java.util.Random;

import utils.Cons;

public class Figure {

	/** The name. */
	private String name;

	/** The index. */
	private Integer index;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public Integer getIndex() {
		return index;
	}

	/**
	 * Instantiates a new random figure.
	 */
	public Figure() {

		Random randomGenerator = new Random();
		this.index = randomGenerator.nextInt(3);
		this.name = Cons.FIGURE_NAME[this.index];
	}

	/**
	 * Instantiates a new figure.
	 *
	 * @param index
	 *            the index
	 */
	public Figure(Integer index) {

		this.name = Cons.FIGURE_NAME[0];

		this.index = index;

	}

	/**
	 * Draw.
	 *
	 * @param f
	 *            the f
	 * @return true, if successful
	 */
	public boolean draw(Figure f) {
		if (f == null) {
			return false;
		}

		return f.getIndex() == this.index;
	}

	/**
	 * Win to.
	 *
	 * @param f
	 *            the f
	 * @return true, if successful
	 */
	public boolean winTo(Figure f) {
		if (f == null) {
			return false;
		}
		return (f.index + 1) % 3 == this.getIndex();
	}
}
