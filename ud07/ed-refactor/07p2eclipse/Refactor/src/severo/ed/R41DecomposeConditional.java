package severo.ed;

import java.util.Date;

public class R41DecomposeConditional {

	private static final Date SUMMER_START = null;
	private static final Date SUMMER_END = null;
	private int quantity;
	private int winterRate;
	private int summerRate;
	private int winterServiceCharge;

	public double condicion(Date date) {
		double charge;
		
                if(esVerano(date)){
                    change = summerChange(quantity);    
                }
                else{
                    change = winterChange(quantity);    
                }

        public int summerChange(){
            return quantity * winterRate + winterServiceCharge;
        }
        
        public int winterChange(){
            return quantity * summerRate;
        }
	
}