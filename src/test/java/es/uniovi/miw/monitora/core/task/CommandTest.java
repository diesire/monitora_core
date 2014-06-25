package es.uniovi.miw.monitora.core.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void testConstructorParams() {
		Command command = new Command(CommandType.SHELL);
		assertEquals(CommandType.SHELL.getDescription(), command.getType()
				.getDescription());
		assertEquals(0, command.getArgs().size());
	}

	@Test
	public void testEmptyConstructor() {
		Command command = new Command();
		assertNull(command.getType());
		assertNotNull(command.getArgs());
		assertEquals(0, command.getArgs().size());
	}
}
