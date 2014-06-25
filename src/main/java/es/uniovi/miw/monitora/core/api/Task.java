package es.uniovi.miw.monitora.core.api;

import java.util.Calendar;

import javax.xml.bind.annotation.*;

import es.uniovi.miw.monitora.core.task.Command;

@XmlRootElement
public class Task {

	private Calendar creationDate;
	private String id;
	private Command command;
	private String commandArgs; //XXX
	private String type; //XXX
	private String resultType;
	private String scheduler;
	private String schedulerArgs;

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

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
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
				"Task [creationDate=%s, id=%s, command=%s, scheduler=%s]",
				creationDate.getTime(), id, command, scheduler);
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String getCommandArgs() {
		return commandArgs;
	}

	public void setCommandArgs(String commandArgs) {
		this.commandArgs = commandArgs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
