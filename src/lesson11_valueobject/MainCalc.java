package lesson11_valueobject;

import lesson11_valueobject.Calc;
import lesson11_valueobject.CalcBO;

public class MainCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.x = 10;
        calc.y = 2;
        System.out.println(calc.x + calc.y);
        System.out.println(calc.x - calc.y);
        System.out.println(calc.x * calc.y);
        System.out.println(calc.x / calc.y);
        
        CalcBO calcBO = new CalcBO();
        System.out.println(calcBO.add());
        System.out.println(calcBO.sub());
        System.out.println(calcBO.multi());
        System.out.println(calcBO.div());
    }
}
