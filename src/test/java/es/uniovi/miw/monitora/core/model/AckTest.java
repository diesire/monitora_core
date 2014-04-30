package es.uniovi.miw.monitora.core.model;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import es.uniovi.miw.monitora.core.api.Ack;

public class AckTest {

	@Test
	public void testUpdate() {
		Ack ack = new Ack();
		Calendar now = Calendar.getInstance(); 
		ack.setUpdate(now);
		
		assertEquals("update getter/setter mismatch", now, ack.getUpdate());
	}

}
