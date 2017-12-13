package Wifi;
public class WiFi implements Comparable<WiFi> {
	double LAT, LON, ALT;
	String Time;
	private String SSID;
	private String MAC;
	private double freq, signal;
	 public WiFi(String SSID,String MAC,  double freq, double signal){
		 this.signal=signal;
		 this.MAC= MAC;
		 this.SSID= SSID;
		 this.freq= freq;
	 }
	public WiFi(String SSID,String MAC,  double freq, double signal,double LAT,double LON,double ALT,String Time){
 		this.LAT = LAT;
 		this.LON = LON;
 		this.ALT = ALT;
 		 this.signal=signal;
 		 this.MAC= MAC;
 		 this.SSID= SSID;
 		 this.freq= freq;
 		 this.Time = Time;
 	 }
 	
	public WiFi(WiFi copy){
 		this.LAT = copy.LAT;
 		this.LON = copy.LON;
 		this.ALT = copy.ALT;
 		 this.signal=copy.signal;
 		 this.MAC= copy.MAC;
 		 this.SSID= copy.SSID;
 		 this.freq= copy.freq;
	}
	
	public double getLAT(){
 		return LAT;	
 	}
 	
 	public double getLON(){
 		return LON;	
 	}
 	
 	public String getTime(){
 		return new String(Time);	
 	}
 	
 	public double getFreq(){
 		return freq;	
 	}
 	
 	public double getALT(){
 		return ALT;	
 	}
 	public String getSSID(){
 		return new String(SSID);	
 	}
 	public String getMAC(){
 		return new String(MAC);	
 	}
	 public double getSignal(){
		 return signal;
	 }
	 public String toString(){
		 return","+signal+","+MAC+","+SSID+","+freq;
	 }
	@Override
	public int compareTo(WiFi other) {
		if (this.signal < other.signal)
			return 1;
		else if (this.signal > other.signal)
			return -1;
		return 0;
	}
}