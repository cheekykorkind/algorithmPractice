package FactoryMethodPattern;

/*
 * 1. static method는 인스턴스를 만들지 않고도 호출할 수 있다.
 * 2. 1. 의 특성을 이용해서 new를 안쓰기 위해서 static method를 팩토리 패턴에서 활용하는듯하다.
 * 3. 1. 이 없다면 getCoffee메소드 쓰기위해서 계속 Factory 인스턴스를 만들어야 하는데 그렇게 되면 그냥 new Coffee() 사용하는것 보다 못하기 때문이다.
 */
public class CoffeeFactory {
	public static Coffee getCoffee(String coffeeType){
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
