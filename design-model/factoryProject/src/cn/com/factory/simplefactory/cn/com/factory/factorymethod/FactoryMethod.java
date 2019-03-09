package cn.com.factory.simplefactory.cn.com.factory.factorymethod;

import cn.com.interfaces.IDrinkFactory;

public class FactoryMethod {

    public static void main(String[] args) {

        IDrinkFactory IDrinkFactory = new BeerFactory();
        System.out.println(IDrinkFactory.tasty());
        IDrinkFactory IDrinkFactory1 = new CoffeeFactory();
        System.out.println(IDrinkFactory1.tasty());
        IDrinkFactory IDrinkFactory2 = new OrangeFactory();
        System.out.println(IDrinkFactory2.tasty());

    }
}
