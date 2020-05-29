package javacoding.section1;

import java.math.BigDecimal;

public class Simpleintersestrunner {

	public static void main(String[] args) {
		Simpleinterestcalculator calculator = new Simpleinterestcalculator("4500.00", "7.5");
		BigDecimal totalsum = calculator.calculatetotalvalue(5);
		System.out.println(totalsum);

	}

}
