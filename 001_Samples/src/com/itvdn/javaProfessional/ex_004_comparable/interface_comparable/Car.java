package com.itvdn.javaProfessional.ex_004_comparable.interface_comparable;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;
        int price = this.price - ((Car) o).price;
        int model = this.model.compareTo(((Car) o).model);
        int color = this.color.compareTo(((Car) o).color);
        if (temp != 0) {
            return temp;
        }if(price!= 0){
             return price;
        } if(model!=0) {
             return model;
         }if (color!=0){
            return color;
        } else {
            return temp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}