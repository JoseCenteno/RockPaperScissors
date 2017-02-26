package game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatchTest {

	Match match;
	@Before
	public void init() {
		match = new Match();
	}
	
	@Test
	public void testPlayLength() {
		match.Play();
		assertEquals(100, match.getLstMove().size(),0);
	}
	
	@Test
	public void testPlayWinsPlayer1() {
		match.Play();
		assertTrue(match.getWinsPlayer1()>0);
	}
	
	@Test
	public void testPlayWinsPlayer2() {
		match.Play();
		assertTrue(match.getWinsPlayer2()>0);
	}
	
	@Test
	public void testDraw() {
		match.Play();
		assertTrue(match.getDraw()>0);
	}
}
