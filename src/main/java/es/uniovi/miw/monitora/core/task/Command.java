package es.uniovi.miw.monitora.core.task;

public interface Command {
	void run();

	void setArgs(String args);

	String getArgs();
}
