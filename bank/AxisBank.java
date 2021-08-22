package org.bank;

/*Assignment3:
============
    Class     :BankInfo
    Methods :saving(),fixed(),deposit()

     Class     :AxisBank
     Methods :deposit()

Description:
You have to override the method deposit in AxisBank.

 * 
 */

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("I have deposit accouunt in HDFC");
		
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		System.out.println("used Method overriding");
		obj.deposit(); //Used Method overriding 
		obj.fixed();
		obj.savings();
	}

}
