package es.uniovi.miw.monitora.core.snapshot;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StdoutResult extends TaskResult {
	public String output;

	@Override
	public String toString() {
		int maxLen = 30;
		return String.format("StdoutResult [taskId=%s, output=%s]", taskId,
				output.substring(0, Math.min(output.length(), maxLen)));
	}

}
