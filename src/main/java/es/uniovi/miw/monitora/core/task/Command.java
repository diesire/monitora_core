package es.uniovi.miw.monitora.core.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Command {

	private CommandType type;
	private List<String> args;

	public Command() {
		args = new ArrayList<String>();
	}

	public Command(CommandType type, String... args) {
		this();
		this.setType(type);
		this.setArgs(Arrays.asList(args));
	}

	public List<String> getArgs() {
		return args;
	}

	public void setArgs(List<String> args) {
		this.args = args;
	}

	public CommandType getType() {
		return type;
	}

	public void setType(CommandType type) {
		this.type = type;
	}
}
