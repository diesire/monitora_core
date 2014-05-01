package es.uniovi.miw.monitora.core.api;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Entity class. Xml notation allow un/marshalling
 * @author diesire
 */
@XmlRootElement
public class Ack {
	
	private Calendar update;

	public Calendar getUpdate() {
		return update;
	}

	public void setUpdate(Calendar update) {
		this.update = update;
	}
}
