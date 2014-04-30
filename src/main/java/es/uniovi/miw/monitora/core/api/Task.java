package es.uniovi.miw.monitora.core.api;

import java.util.Calendar;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Task {

	private Calendar creation;
	private String id;
	private String commandType;
	private String commandArgs;
	private String scheduler;
	private String schedulerArgs;

	public String getCommandType() {
		return commandType;
	}

	public void setCommand(String commandType) {
		this.commandType = commandType;
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

	public Calendar getCreation() {
		return creation;
	}

	public void setCreation(Calendar creation) {
		this.creation = creation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format(
				"Task [creation=%s, id=%s, commandType=%s, scheduler=%s]",
				creation, id, commandType, scheduler);
	}
	
	
}
