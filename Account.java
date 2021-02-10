package javaLearning;

public class Account
{
	//Attributes
	private int _number;
	private float _money;
	
	//Constructors
	public Account(int number, float money)
	{
		_number = number;
		_money = money;
	}
	public Account(int number)
	{
		_number = number;
		_money = 0;
	}
	
	//Methods
	public int getNumber()
	{
		return _number;
	}
	public float getMoney()
	{
		return _money;
	}
	public void addMoney(float amount)
	{
		_money += amount;
	}
	public void dropMoney(float amount)
	{
		_money -= amount;
	}

	//toString method
	public String toString()
	{
		return "Account " + _number + ": $" + _money;
	}
}