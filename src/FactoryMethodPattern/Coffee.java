package FactoryMethodPattern;
import FactoryMethodPattern.TastyChangeItem;

public class Coffee {
	private String _coffeeType;
	public TastyChangeItem _tastyChangeItem;
	
	public Coffee(String coffeeTpye){
		this._coffeeType = coffeeTpye;
	}
	
	public void changeTasty(){
		System.out.print(this._coffeeType);
		_tastyChangeItem.changeTasty();
	}
}
