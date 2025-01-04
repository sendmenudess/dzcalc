package pro.sky.calculator;

public interface CalcService {
    String welcome();


    String multiply(int num1, int num2);

    String divide(double num1, double num2);

    String plus(int num1, int num2);

    String minus(int num1, int num2);
}
