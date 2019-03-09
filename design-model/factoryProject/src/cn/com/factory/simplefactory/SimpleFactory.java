package cn.com.factory.simplefactory;

import cn.com.interfaces.IDrinkFactory;

public class SimpleFactory {

    public static IDrinkFactory getDrinkTasty(String type){
        if("Beer".equals(type)){
            return new Beer();
        }else if("Coffee".equals(type)){
            return new Coffee();
        }else if("Orange".equals(type)){
            return new Orange();
        }else{
            throw new RuntimeException("类型存在！");
        }

    }

    public static void main(String[] args) {

        IDrinkFactory IDrinkFactory = SimpleFactory.getDrinkTasty("Beer");
        System.out.println(IDrinkFactory.tasty());
        IDrinkFactory d1 = SimpleFactory.getDrinkTasty("Coffee");
        System.out.println(d1.tasty());
        IDrinkFactory d2 = SimpleFactory.getDrinkTasty("Orange");
        System.out.println(d2.tasty());
    }
}
