package es.uniovi.miw.monitora.core.task;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CommandType {

	public static final CommandType SHELL = new CommandType("SHELL");
	public static final CommandType QUERY = new CommandType("QUERY");

	private String description;
	
	public CommandType() {
	}

	public CommandType(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return String.format("CommandType.=%s", description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
