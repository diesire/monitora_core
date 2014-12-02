package es.uniovi.miw.monitora.core.snapshot;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import es.uniovi.miw.monitora.core.api.Task;

@XmlRootElement
public class Snapshot {
	public Calendar creationDate;
	public List<Task> tasks;
	public List<TaskResult> results;
	
	public Snapshot() {
		tasks = new ArrayList<Task>();
		results = new ArrayList<TaskResult>();
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return String
				.format("Snapshot [creationDate=%s,\ntasks=%s,\nresults=%s]",
						creationDate.getTime(),
						tasks != null ? tasks.subList(0,
								Math.min(tasks.size(), maxLen)) : null,
						results != null ? results.subList(0,
								Math.min(results.size(), maxLen)) : null);
	}

}
