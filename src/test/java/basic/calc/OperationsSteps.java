package basic.calc;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class OperationsSteps {

    private float number1, number2;
    private String sign;
    private double result;

    @Given("Two numbers number1 <number1> and number2 <number2>")
    public void giveMeTwoNumbers(@Named("number1") float number1, @Named("number2") float number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    @Given("A number number1 <number1>")
    public void giveMeANumber(@Named("number1") float number1){
        this.number1 = number1;
    }

    @Given("the operation sign is <sign>")
    public void giveMeAnOperation(@Named("sign") String sign){
        this.sign = sign;
    }

    @When("the operation is performed")
    public void performOperation(){

        if(this.sign.equals("+")){
            this.result = Calculator.add(this.number1, this.number2);
        }

        if(this.sign.equals("-")){
            this.result = Calculator.subtract(this.number1, this.number2);
        }

        if(this.sign.equals("*")){
            this.result = Calculator.multiply(this.number1, this.number2);
        }

        if(this.sign.equals("/")){
            this.result = Calculator.divide(this.number1, this.number2);
        }

        if(this.sign.equals("**")){
            this.result = Calculator.squared(this.number1);
        }

        if(this.sign.equals("^")){
            this.result = Calculator.power(this.number1, this.number2);
        }
    }

    @Then("the result is <result>")
    public void exposeResult(@Named("result") double result){
        Assert.assertTrue("Wrong Result!", this.result == result);
    }


}
