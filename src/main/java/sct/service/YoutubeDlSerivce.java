package sct.service;

import com.sapher.youtubedl.YoutubeDL;
import com.sapher.youtubedl.YoutubeDLRequest;

public class YoutubeDlSerivce {
		
	static String dossier = System.getProperty("F:\\dev\\workspace\\youtube-dl\\Youtube-dl\\exe");
	
	public int telecharge(String videoUrl) {
		
		try {
			YoutubeDLRequest request = new YoutubeDLRequest(videoUrl, dossier);
			request.setOption("ignore-errors");		// --ignore-errors
			request.setOption("output", "%(id)s");	// --output "%(id)s"
			request.setOption("retries", 10);		// --retries 10
			
			YoutubeDL.execute(request);
		} catch (Exception e) {
			return 1;
		}
	
		return 0;
	}
	
	public int telechargeCrunchyroll(String videoUrl) {
		
		try {
			YoutubeDLRequest request = new YoutubeDLRequest(videoUrl, dossier);
			request.setOption("all-subs"); // --all-subs
			
			YoutubeDL.execute(request);
		} catch (Exception e) {
			return 1;
		}
	
		return 0;
	}
}
