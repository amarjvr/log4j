package logamr;

import org.apache.log4j.Logger;

public class amr {
	private static Logger log = Logger.getLogger(amr.class); 
	public static void main(String[] args) {
		for(int i =0; i<=10000;i++) {
		log.debug("this is a debug but not trace");
		log.info("info message");
		log.warn("warn message");
		log.error("error message");
		log.fatal("fatal message");
		}
	}

}


