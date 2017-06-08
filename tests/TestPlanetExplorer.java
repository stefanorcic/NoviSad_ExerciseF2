import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("f");
		String expected = "(0,1,N)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandBack() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("b");
		String expected = "(0,2,N)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandR() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("r");
		String expected = "(0,0,E)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandL() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("l");
		String expected = "(0,0,W)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandFF() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("ff");
		String expected = "(0,2,N)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandFFR() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("ffr");
		String expected = "(0,2,E)";
		assertEquals(expected, rower);
	}
	@Test
	public void test_executeCommandFFL() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("ffl");
		String expected = "(0,2,W)";
		assertEquals(expected, rower);
	}
}
