package pro.sky.calculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String multiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }

    @Override
    public String plus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

}
