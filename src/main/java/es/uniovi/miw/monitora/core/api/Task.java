package es.uniovi.miw.monitora.core.api;

import java.util.Calendar;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class Task {

	private Calendar creationDate;
	private String id;
	private String commandType;
	private String commandArgs;
	private String resultType;
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
				"Task [creationDate=%s, id=%s, commandType=%s, scheduler=%s]",
				creationDate.getTime(), id, commandType, scheduler);
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

}
