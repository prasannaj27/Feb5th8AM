package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		// TODO Auto-generated method stub

		System.out.println("vivo v17pro");
	}
	
	private void phoneMieiNum() {
		// TODO Auto-generated method stub

		System.out.println("SFSC15615151");
	}
	
	private void camera() {
		// TODO Auto-generated method stub

		System.out.println("48MP");
	}
	
	private void storage() {
		// TODO Auto-generated method stub

		System.out.println("8GB RAM 128 GB internal");
	}
	
	private void osName() {
		// TODO Auto-generated method stub

		System.out.println("Android");
	}

	public static void main(String[] args) {
		
		PhoneInfo phin = new PhoneInfo();
		
		phin.phoneName();
		phin.phoneMieiNum();
		phin.camera();
		phin.storage();
		phin.osName();
		}
}
