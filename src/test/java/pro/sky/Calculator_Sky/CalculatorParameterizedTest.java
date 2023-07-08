package pro.sky.Calculator_Sky;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorParameterizedTest {

    private final Calculator calculator=new Calculator();

    public static Stream<Arguments> paramsForTest(){
        return  Stream.of(
                Arguments.of(76.0D,34.0D),
                Arguments.of(354D,26.7D)
        );
    }
@ParameterizedTest
@MethodSource("paramsForTest")
    public void plusTest(Double num1, Double num2){
        String actual=calculator.numbPlus(num1,num2);
        Double exp=num1+num2;
        String expected= num1.toString()+" + "+num2.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);

    }
    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void minusTest(Double num1, Double num2){
        String actual=calculator.numbMinus(num1,num2);
        Double exp=num1-num2;
        String expected= num1.toString()+" - "+num2.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);

    }
    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void multiplyTest(Double num1, Double num2){
        String actual=calculator.numbMultiply(num1,num2);
        Double exp=num1*num2;
        String expected= num1.toString()+" * "+num2.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource("paramsForTest")
    public void divideTest(Double num1, Double num2){
        String actual=calculator.numbDivide(num1,num2);
        Double exp=num1/num2;
        String expected= num1.toString()+" / "+num2.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);
    }
}
