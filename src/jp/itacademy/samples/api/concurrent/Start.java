package jp.itacademy.samples.api.concurrent;

public class Start {
	
	private String userName;
	private String userSign;
	
	public void hold(String userName) {
		this.userName = userName;
		this.userSign = userName;
		checkSign();
		System.out.println(this.userName + "さんが座っています");
		
		private void checkSign() {
			if (userName.charAt(0) != userSign.charAt(0)) {
				System.err.println("サインと名前がちがいますが..." + " name:" + userName + " sign:" + userSign);
				
			}
		}
		
	}

	private void checkSign() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	


}
