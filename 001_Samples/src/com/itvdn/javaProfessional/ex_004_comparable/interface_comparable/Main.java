package com.itvdn.javaProfessional.ex_004_comparable.interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Bed");
        Car c2 = new Car(190, 8000, "AMW", "Red");
        Car c3 = new Car(186, 8000, "BMW", "Red");
        Car[] c = {c1, c2, c3};

        Arrays.sort(c);   // ClassCastException
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
