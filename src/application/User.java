package application;

public class User {
	
	private String username;
	private String password;
	private double walletBalance;
	public User(String username, String password, double walletBalance) {
	this.username = username;
	this.password = password;
	this.walletBalance = walletBalance;
	}
	public String getUsername() {
	return username;
	}
	public String getPassword() {
	return password;
	}
	public double getWalletBalance() {
	return walletBalance;
	}
	public void depositToWallet(double amount) {
	walletBalance += amount;
	}
	public void deductFromWallet(double amount) {
	walletBalance -= amount;
	}
	}

