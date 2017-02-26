package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoveTest {
	Move move;
	
	@Before
	public void init(){
		move = new Move();
	}
	
	@Test
	public void testGoFigure2() {		
		move.go();
		assertEquals(0, move.getFigure2().getIndex(), 0);
	}

	@Test
	public void testGoFigure1() {		
		
		Integer first_idx = 0;
		Integer idx = 0;
		Integer i = 0;
		Boolean diff = false;
		
		move.go();
		first_idx = move.getFigure1().getIndex();
		 
		do {
		  move.go();
		  idx = move.getFigure1().getIndex();
		  if (!diff & idx != first_idx) {		  
			  diff = true;
		  }
		  i++;		
		} while(i<10);
							
		assertTrue(diff);	
		
		
	}
	
	@Test
	public void testGoWinner() {		
		move.go();
		assertTrue(move.getWinner() ==1 || move.getWinner() == 2 || move.getWinner() == 0);
		
	}
}
