package cn.com.factory.simplefactory.cn.com.factory.factorymethod;

import cn.com.factory.simplefactory.Beer;
import cn.com.interfaces.IDrink;
import cn.com.interfaces.IDrinkFactory;

public class BeerFactory implements IDrink {
    @Override
    public IDrinkFactory drink() {
        return new Beer();
    }
}

