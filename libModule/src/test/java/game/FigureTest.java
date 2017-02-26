package game;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FigureTest {
	private Figure f;

	@Before
	public void init() {

	}

	@Test
	public void testFigure() {
		
		Integer first_idx = 0;
		Integer idx = 0;
		Integer i = 0;
		Boolean diff = false;
		
		Figure figure = new Figure();
		first_idx = figure.getIndex();
		 
		do {
		  figure = new Figure();
		  idx = figure.getIndex();
		  if (!diff & idx != first_idx) {		  
			  diff = true;
		  }
		  i++;		
		} while(i<10);
							
		assertTrue(diff);	
	}

	@Test
	public void testFigureInteger() {
		f = new Figure(2);
		assertEquals(2, f.getIndex(), 0);
	}

	@Test
	public void testDraw() {
		f = new Figure(2);
		Figure f2 = new Figure(2);

		assertTrue(f.getIndex() == f2.getIndex());

	}

	@Test
	public void testWinTo() {
		f = new Figure(2);
		Figure f2 = new Figure(1);

		assertTrue(f.winTo(f2));

	}

}
