package cn.com.cn.com.abstractfactory;

import cn.com.interfaces.IDrink;

public class OrangeFactory implements DinksFactory {
    @Override
    public IDrinks getProductDrink() {
        return new DomesticFactory();
    }

    @Override
    public ITaste getDrinkTasty() {
        return new Orange();
    }
}
