package jp.itacademy.samples.api.concurrent;

public class Start {

	private String userName;
	private String userSign;

	public void hold(String userName) {
		this.userName = userName;
		this.userSign = userName;
		checkSign();
		System.out.println(this.userName + "���񂪍����Ă��܂�");
	}

	private void checkSign() {
		if (userName.charAt(0) != userSign.charAt(0)) {
			System.err.println("�T�C���Ɩ��O���������܂���..." + " name:" + userName
					+ " sign:" + userSign);
		}
	}

}
