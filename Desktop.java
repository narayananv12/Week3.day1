package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("This is details of desktop size is 14");
	}

	public static void main(String[] args) {
		
		Desktop comobj = new Desktop();
		comobj.computerModel();
		comobj.desktopSize();
		
		
		
	}
	
}
