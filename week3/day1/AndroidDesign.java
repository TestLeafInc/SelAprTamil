package week3.day1;

public interface AndroidDesign {
	
	public long phoneNumber = 0;
	
	/*
	 * Interface is all about design and no implementation
	 * Method: startPhone, makeCall, sendSMS
	 * 
	 * It is done by architect / lead. 
	 * 
	 */
	
	public boolean startPhone();
	
	void makeCall(String type);
	
	public void sendSMS();
	
	public void faceAuthentication();

}
