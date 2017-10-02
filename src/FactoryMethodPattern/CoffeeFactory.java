package FactoryMethodPattern;

/*
 * 1. static method�� �ν��Ͻ��� ������ �ʰ� ȣ���� �� �ִ�.
 * 2. 1. �� Ư���� �̿��ؼ� new�� �Ⱦ��� ���ؼ� static method�� ���丮 ���Ͽ��� Ȱ���ϴµ��ϴ�.
 * 3. 1. �� ���ٸ� getCoffee�޼ҵ� �������ؼ� ��� Factory �ν��Ͻ��� ������ �ϴµ� �׷��� �Ǹ� �׳� new Coffee() ����ϴ°� ���� ���ϱ� �����̴�.
 */
public class CoffeeFactory {
	public static Coffee getCoffee(String coffeeType){
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
