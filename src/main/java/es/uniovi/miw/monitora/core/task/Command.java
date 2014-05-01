package es.uniovi.miw.monitora.core.task;

public interface Command {
	Object run();

	void setCommandArgs(String commandArgs);

	String getCommandArgs();
}
