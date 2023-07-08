package pro.sky.Calculator_Sky;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/calculator")
public class CulatorController {
    private final Calculator calculator;

    public CulatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String hello() {
        return calculator.hello();
    }

    @GetMapping(path = "/error")
    @ExceptionHandler({DivideArgumentException.class, NullPointerException.class})
    public String errorPage() {
        return calculator.error();
    }

    @GetMapping(path = "/plus")
    public String numbPlus(@RequestParam(value = "num1", required = false) Double num01, @RequestParam(value = "num2", required = false) Double num02) {
        return calculator.numbPlus(num01, num02);
    }

    @GetMapping(path = "/minus")
    public String numbMinus(@RequestParam(value = "num1", required = false) Double num01, @RequestParam(value = "num2", required = false) Double num02) {
        return calculator.numbMinus(num01, num02);
    }

    @GetMapping(path = "/multiply")
    public String numbMultiply(@RequestParam(value = "num1", required = false) Double num01, @RequestParam(value = "num2", required = false) Double num02) {
        return calculator.numbMultiply(num01, num02);
    }

    @GetMapping(path = "/divide")
    public String numbDivide(@RequestParam(value = "num1", required = false) Double  num01, @RequestParam(value = "num2", required = false) Double  num02) {
        return calculator.numbDivide(num01, num02);
    }
}