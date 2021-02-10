package javaLearning;

import java.util.ArrayList;

public class Client
{
	//Attributes
	private String _firstName;
	private String _lastName;
	private ArrayList<Account> _accounts;
	
	//Constructors
	public Client(String fname, String lname)
	{
		_firstName = fname;
		_lastName = lname;
		_accounts = new ArrayList<>();
	}
	
	//Methods
	public void openAccount(Account account)
	{
		_accounts.add(account);
	}
	public void openAccount(int number, float money)
	{
		_accounts.add(new Account(number, money));
	}
	public boolean closeAccount(int number)
	{
		for(int i = 0; i < _accounts.size(); i++)
			if(_accounts.get(i).getNumber() == number)
			{
				_accounts.remove(i);
				return true;
			}
		return false;
	}
	
	//toString method
	public String toString()
	{
		String toReturn = _firstName + " " + _lastName + " owns:";
		
		for(Account account: _accounts)
			toReturn += "\n\r" + account;
		
		return toReturn;
	}
}