package es.uniovi.miw.monitora.core.model;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entity class. Xml notation allow un/marshalling
 * @author diesire
 */
@XmlRootElement
public class Ack {
	static private Logger logger = LoggerFactory.getLogger(Ack.class);
	
	private Calendar update;

	public Calendar getUpdate() {
		return update;
	}

	public void setUpdate(Calendar update) {
		logger.debug("set update: {0}", update);
		this.update = update;
	}
}
