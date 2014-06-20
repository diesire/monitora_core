package es.uniovi.miw.monitora.core.task;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SchedulerType {

	public static final String CRON = "CronScheduler";
	public static final String MONTHLY = "MonthlyScheduler";

}
