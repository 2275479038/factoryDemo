package cn.com.factory.simplefactory;

import cn.com.interfaces.IDrinkFactory;

public class Orange implements IDrinkFactory {

    @Override
    public String tasty() {
        return "it`s sweet";
    }
}
