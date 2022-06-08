package com.javarush.task.pro.task10.task1010;

/* 
Два айфона
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Iphone iphone = (Iphone) obj;
        if (obj == null || this.model == null || this.color == null || iphone.model == null || iphone.color == null) {
            return false;
        }
        if (this.price != iphone.price) {
            return false;
        }
        return model.equals(iphone.model) && color.equals(iphone.color);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));
    }
}
