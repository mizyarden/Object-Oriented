package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Wifi.WiFi;

public class FilterTime implements Filter {
	Date startTime;
	Date endTime ;
	
	public FilterTime(String StartTime, String EndTime){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			this.startTime = sdf.parse(StartTime);
			this.endTime = sdf.parse(EndTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean isBelong(WiFi wifi) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date wifiTime = sdf.parse(wifi.getTime());
			return (startTime.before(wifiTime) && endTime.after(wifiTime));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

}
