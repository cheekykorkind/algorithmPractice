package FactoryMethodPattern;
/*
	팩토리 패턴을 적용하기 전이다. 아래의 경우 유지보수를 하려면
	커피 종류별로 클래스를 수정해 줘야 한다. 그러나
	팩토리 패턴을 사용하면 모든 커피 종류를 팩토리에서 관리하므로
	유지보수가 편해진다.
	Americano americano = new Americano();
	americano.changeTasty();
	Cappuccino cappuccino = new cappuccino();
	cappuccino.changeTasty();
	Espresso espresso = new Espresso();
	espresso.changeTasty();
 */
public class FactoryMethodMain {
	public FactoryMethodMain(){
		Coffee americano = CoffeeFactory.getCoffee("아메리카노");
		americano.changeTasty();
		Coffee cappuccino = CoffeeFactory.getCoffee("카푸치노");
		cappuccino.changeTasty();
		Coffee espresso = CoffeeFactory.getCoffee("에스프레소");
		espresso.changeTasty();		
	}
}
/*
 class 1개에 표현할때 아래와 같다. 
public class Main {
	public static void main(String[] args) {
		Coffee americano = CoffeeFactory.getCoffee("아메리카노");
		americano.changeTasty();
		Coffee cappuccino = CoffeeFactory.getCoffee("카푸치노");
		cappuccino.changeTasty();
		Coffee espresso = CoffeeFactory.getCoffee("에스프레소");
		espresso.changeTasty();
	}
}
class CoffeeFactory {
static Coffee getCoffee(String coffeeType){
	Coffee _coffee = new Coffee(coffeeType);
	
	if(coffeeType.equals("아메리카노")){
		_coffee._tastyChangeItem = new Americano();
	} else if(coffeeType.equals("카푸치노")){
		_coffee._tastyChangeItem = new Cappuccino();
	} else if(coffeeType.equals("에스프레소")){
		_coffee._tastyChangeItem = new Espresso();
	}
	
	return _coffee;
}
}

class Coffee{
private String _coffeeType;
private TastyChangeItem _tastyChangeItem;

public Coffee(String coffeeTpye){
	this._coffeeType = coffeeTpye;
}

public void changeTasty(){
	System.out.print(this._coffeeType);
	_tastyChangeItem.changeTasty();
}
}

interface TastyChangeItem{
public void changeTasty();
}

class Americano implements TastyChangeItem {
public void changeTasty(){
	System.out.println("(아메리카노)로 변화했다!");
}
}
class Cappuccino implements TastyChangeItem {
public void changeTasty(){
	System.out.println("(카푸치노)로 변화했다!");
}
}
class Espresso implements TastyChangeItem {
public void changeTasty(){
	System.out.println("(에스프레소)로 변화했다!");
}
}
*/