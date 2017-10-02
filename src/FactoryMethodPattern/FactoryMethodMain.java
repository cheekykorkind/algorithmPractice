package FactoryMethodPattern;
/*
	���丮 ������ �����ϱ� ���̴�. �Ʒ��� ��� ���������� �Ϸ���
	Ŀ�� �������� Ŭ������ ������ ��� �Ѵ�. �׷���
	���丮 ������ ����ϸ� ��� Ŀ�� ������ ���丮���� �����ϹǷ�
	���������� ��������.
	Americano americano = new Americano();
	americano.changeTasty();
	Cappuccino cappuccino = new cappuccino();
	cappuccino.changeTasty();
	Espresso espresso = new Espresso();
	espresso.changeTasty();
 */
public class FactoryMethodMain {
	public FactoryMethodMain(){
		Coffee americano = CoffeeFactory.getCoffee("�Ƹ޸�ī��");
		americano.changeTasty();
		Coffee cappuccino = CoffeeFactory.getCoffee("īǪġ��");
		cappuccino.changeTasty();
		Coffee espresso = CoffeeFactory.getCoffee("����������");
		espresso.changeTasty();		
	}
}
/*
 class 1���� ǥ���Ҷ� �Ʒ��� ����. 
public class Main {
	public static void main(String[] args) {
		Coffee americano = CoffeeFactory.getCoffee("�Ƹ޸�ī��");
		americano.changeTasty();
		Coffee cappuccino = CoffeeFactory.getCoffee("īǪġ��");
		cappuccino.changeTasty();
		Coffee espresso = CoffeeFactory.getCoffee("����������");
		espresso.changeTasty();
	}
}
class CoffeeFactory {
static Coffee getCoffee(String coffeeType){
	Coffee _coffee = new Coffee(coffeeType);
	
	if(coffeeType.equals("�Ƹ޸�ī��")){
		_coffee._tastyChangeItem = new Americano();
	} else if(coffeeType.equals("īǪġ��")){
		_coffee._tastyChangeItem = new Cappuccino();
	} else if(coffeeType.equals("����������")){
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
	System.out.println("(�Ƹ޸�ī��)�� ��ȭ�ߴ�!");
}
}
class Cappuccino implements TastyChangeItem {
public void changeTasty(){
	System.out.println("(īǪġ��)�� ��ȭ�ߴ�!");
}
}
class Espresso implements TastyChangeItem {
public void changeTasty(){
	System.out.println("(����������)�� ��ȭ�ߴ�!");
}
}
*/