package pro.sky.calculator.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalcService;

@RestController
@RequestMapping("/calculator")

public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String welcome() {
        return calcService.welcome();
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.multiply(num1, num2);
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.plus(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        try {
            return calcService.divide(num1, num2);
        } catch (ArithmeticException e) {
            return "Error" + e.getMessage();
        }
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calcService.minus(num1, num2);
    }

}
