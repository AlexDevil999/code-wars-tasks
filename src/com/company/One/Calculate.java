package com.company.One;

public class Calculate {

    public static String bmi(double weight, double height) {
        double res = weight / Math.pow(height, 2);

       if (res <= 18.5){
           return "Underweight";
       }
       if (res <= 25.0 ) return "Normal";
       if (res <= 30.0 ) return "Overweight";
       if (res > 30) return "Obese";

       return  "null";
    }
}