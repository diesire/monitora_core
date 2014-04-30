package es.uniovi.miw.monitora.core.model;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Task {

	@XmlElement
	private String command;
	@XmlElement
	private String commandArgs;
	@XmlElement
	private String scheduler;
	@XmlElement
	private String schedulerArgs;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getCommandArgs() {
		return commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
	}

	public String getScheduler() {
		return scheduler;
	}

	public void setScheduler(String scheduler) {
		this.scheduler = scheduler;
	}

	public String getSchedulerArgs() {
		return schedulerArgs;
	}

	public void setSchedulerArgs(String schedulerArgs) {
		this.schedulerArgs = schedulerArgs;
	}

	@Override
	public String toString() {
		return String
				.format("Task [command=%s, commandArgs=%s, scheduler=%s, schedulerArgs=%s]",
						command, commandArgs, scheduler, schedulerArgs);
	}

}
