import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		PlanetExplorer pl = new PlanetExplorer(3,3, "");
		String rower = pl.executeCommand("f");
		String expected = "(0,1,E)";
		assertEquals(expected, rower);
	}
}
