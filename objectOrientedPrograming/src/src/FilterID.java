package src;

import Wifi.WiFi;
public class FilterID  implements Filter{
		public String ID;
		public FilterID (String ID){
			this.ID = new String(ID);
		}
		@Override
		public boolean isBelong(WiFi wifi) {

			return this.ID.equals(wifi.getID());
		}
		
	

}
