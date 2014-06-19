package es.uniovi.miw.monitora.core.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTypeTest {
	
	static class BetterCommandType extends CommandType {
		public static final CommandType FOO = new BetterCommandType("FOO");

		protected BetterCommandType(String type) {
			super(type);
		}		
	}

	@Test
	public void test() {
		CommandType foo = BetterCommandType.FOO;
		assertEquals("FOO", foo.getDescription());
	}
}
