package src;

import Wifi.WiFi;

public class FilterGPS implements Filter{
	double lonStart,  latStart, lonEnd, latEnd;
	
	public FilterGPS( double lonStart, double latStart, double lonEnd, double latEnd){
		
			this.lonStart = lonStart;
			this.latStart = latStart;
			this.latEnd = latEnd;
			this.lonEnd = lonEnd;
	}

	@Override
	public boolean isBelong(WiFi wifi) {
		
			if (((wifi.getLON() > this.lonStart) && (wifi.getLON() < this.lonEnd))
					&& ((wifi.getLAT() > this.latStart) && (wifi.getLAT() < this.latEnd))){
				return true;
			}
		
		return false;
	}
	

}
