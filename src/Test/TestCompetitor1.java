package Test;
import static org.junit.Assert.fail;

import model.*;
public class TestCompetitor1 {
	
	private Competitor compe;
	
	private String name1;
	
	private void setupEscenario1() {
		compe = new Competitor();
	}
	
	public void testAddHumanList() {
		setupEscenario1();
		Human e = new Human("lolo", "111");
		Human e1 = new Human("pepe", "222");

		try {
			compe.addHuman(e);
			compe.addHuman(e1);
		} catch (MyException e2) {
			fail();
		}
		try {
			compe.addHuman(e);
		} catch (MyException e2) {
			
		}

	}
	
	public void testFindId() {
		setupEscenario1();
		Human e = new Human("llele", "666");
		compe.findId(e.getId());


	}
	
	
}
