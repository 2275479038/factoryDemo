package cn.com.cn.com.abstractfactory;

import cn.com.interfaces.IDrink;

public class CoffeeFactory implements DinksFactory{
    @Override
    public IDrinks getProductDrink() {
        return new AbroadFactory();
    }

    @Override
    public ITaste getDrinkTasty() {
        return new Coffee();
    }
}
