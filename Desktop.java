package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The Desktop size is : 15 inches ");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel();
		
		Computer obj1 = new Computer();
		obj1.computerModel();
		
	}
	
}
