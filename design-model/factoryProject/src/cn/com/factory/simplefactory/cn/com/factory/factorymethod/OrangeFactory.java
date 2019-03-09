package cn.com.factory.simplefactory.cn.com.factory.factorymethod;

import cn.com.factory.simplefactory.Coffee;
import cn.com.factory.simplefactory.Orange;
import cn.com.interfaces.IDrink;
import cn.com.interfaces.IDrinkFactory;

public class OrangeFactory implements IDrink {
    @Override
    public IDrinkFactory drink() {
        return new Orange();
    }
}

