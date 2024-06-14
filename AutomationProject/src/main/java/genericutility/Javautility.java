package genericutility;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Javautility {
	
	public String getSystemTime() {
		
		return LocalDateTime.now().toString().replace(":", "-");
				
		
	}

}
