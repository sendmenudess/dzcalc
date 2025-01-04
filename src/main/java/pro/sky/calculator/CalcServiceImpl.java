package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalcServiceImpl implements CalcService {

    public String welcome (){
        return "Добро пожаловать в калькулятор";
    }


    @Override
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " * " + num2 + " = " + num1 * num2;
    }

    @Override
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + " / " + num2 + " = " + num1 / num2;
    }

    @Override
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1+num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1-num2;
        return num1 + " - " + num2 + " = " + result;
    }
}
