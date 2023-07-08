package pro.sky.Calculator_Sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    public  final Double num1Kit1=76.0;
    public  final Double num2Kit1=34.0;
    public  final Double num1Kit2=null;
    public  final Double num2Kit2=34.0;
    public  final Double  null1Exception=76.0;
    public  final Double null2Exception=0.0;

    private final Calculator calculator=new Calculator();
@Test
    public void plusTest(){
String actual=calculator.numbPlus(num1Kit1,num2Kit1);
Double exp=num1Kit1+num2Kit1;
    String expected= num1Kit1.toString()+" + "+num2Kit1.toString()+" = "+Double.toString(exp);
assertEquals(expected,actual);
    assertThrows(NullPointerException.class,() -> {
        calculator.numbPlus(num1Kit2,num2Kit2);
    });
}
@Test
    public void minusTest(){
        String actual=calculator.numbMinus(num1Kit1,num2Kit1);
        Double exp=num1Kit1-num2Kit1;
        String expected= num1Kit1.toString()+" - "+num2Kit1.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);
    assertThrows(NullPointerException.class,() -> {
        calculator.numbMinus(num1Kit2,num2Kit2);
    });
    }
@Test
    public void multiplyTest(){
        String actual=calculator.numbMultiply(num1Kit1,num2Kit1);
        Double exp=num1Kit1*num2Kit1;
        String expected= num1Kit1.toString()+" * "+num2Kit1.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);
    assertThrows(NullPointerException.class,() -> {
        calculator.numbMultiply(num1Kit2,num2Kit2);
    });
    }
    @Test
    public void divideTest(){
        String actual=calculator.numbDivide(num1Kit1,num2Kit1);
        Double exp=num1Kit1/num2Kit1;
        String expected= num1Kit1.toString()+" / "+num2Kit1.toString()+" = "+Double.toString(exp);
        assertEquals(expected,actual);
        assertThrows(DivideArgumentException.class,() -> {
            calculator.numbDivide(num1Kit2,num2Kit2);
        });

    }
@Test
    public void exceptionTest(){
        assertThrows(DivideArgumentException.class, () -> {
            calculator.numbDivide(null1Exception,null2Exception);
        });
    }
}
