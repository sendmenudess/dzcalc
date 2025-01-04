package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String welcome (){
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + num1 * num2;
    }

    @Override
    public String divide(double num1, double num2) {
        return  num1 + " / " + num2 + " = " + num1/num2;
    }

    @Override
    public String plus(int num1, int num2) {
        int result = num1+num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {
        int result = num1-num2;
        return num1 + " - " + num2 + " = " + result;
    }
}
