package es.uniovi.miw.monitora.core.api;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class AckTest {
	
	@Test
	public void test() {
		Ack ack = new Ack();
		Calendar now = Calendar.getInstance(); 
		ack.setUpdate(now);
		
		assertEquals("update getter/setter mismatch", now, ack.getUpdate());
	}

}
