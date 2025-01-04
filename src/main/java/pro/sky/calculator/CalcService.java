package pro.sky.calculator;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalcService {
    String welcome();


    String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2);


    String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2);

    String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2);
}
