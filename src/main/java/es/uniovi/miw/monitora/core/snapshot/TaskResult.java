package es.uniovi.miw.monitora.core.snapshot;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class TaskResult {
	public static final String STDOUT = "STDOUT";

	public Calendar startDate;
	public Calendar stopDate;
	public String taskId;
}
