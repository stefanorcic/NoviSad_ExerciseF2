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
	public void test_executeCommandRF() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("rf");
		String expected = "(0,0,E)";
		assertEquals(expected, rower);
	}
}
