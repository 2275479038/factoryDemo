package cn.com.factory.simplefactory;

import cn.com.interfaces.IDrinkFactory;

public class Coffee implements IDrinkFactory {

    @Override
    public String tasty() {
        return "it`s bitter";
    }
}
