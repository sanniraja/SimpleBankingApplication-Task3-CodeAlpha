package com.simplebankingapplication;

class Bank {
	private Account[] accounts;
	private int numAccounts;
	private static final int MAX_ACCOUNTS = 100;

	public Bank() {
		accounts = new Account[MAX_ACCOUNTS];
		numAccounts = 0;
	}

	public void addAccount(Account acc) {
		accounts[numAccounts++] = acc;
	}

	public Account findAccount(int accNumber) {
		for (int i = 0; i < numAccounts; i++) {
			if (accounts[i].getAccNumber() == accNumber) {
				return accounts[i];
			}
		}
		return null;
	}
}
