package pro.sky.Calculator_Sky;


import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorInterface {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    public String error() {
        return "Не корректно введены значения чисел";
    }

    public String numbPlus(Double num01, Double num02) {
        if (num01 == null || num02 == null){throw new NullPointerException();}
        Double num3 = num01 + num02;
        String answer= num01.toString()+" + "+num02.toString()+" = "+Double.toString(num3);
        return answer;
    }

    public String numbMinus(Double num01, Double num02) {
        if (num01 == null || num02 == null){throw new NullPointerException();}
        Double num3 = num01 - num02;
        String answer= num01.toString()+" - "+num02.toString()+" = "+Double.toString(num3);
        return answer;
    }

    public String numbMultiply(Double num01, Double num02) {
        if (num01 == null || num02 == null){throw new NullPointerException();}
        Double num3 = num01 * num02;
        String answer= num01.toString()+" * "+num02.toString()+" = "+Double.toString(num3);
        return answer;
    }

    public String numbDivide(Double num01, Double num02) {
        if (num01 == null || num02 == null||num02==0){throw new DivideArgumentException();}
        double num3 = num01 / num02;
        String answer= num01.toString()+" / "+num02.toString()+" = "+Double.toString(num3);
        return answer;

    }
}