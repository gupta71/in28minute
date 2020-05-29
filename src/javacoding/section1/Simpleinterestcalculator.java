package javacoding.section1;

import java.math.BigDecimal;

public class Simpleinterestcalculator {
	BigDecimal principal;
	BigDecimal rate;

	public Simpleinterestcalculator(String principal, String rate) {
		this.principal = new BigDecimal(principal);// converting string to bigdecimal valure;
		this.rate = new BigDecimal(rate).divide(new BigDecimal(100));

	}

	public BigDecimal calculatetotalvalue(int noofyears) {
		// total value=principal+principal*rate*noofyears
		BigDecimal totalvalue = principal.add(principal.multiply(rate).multiply(new BigDecimal(noofyears)));
		return totalvalue;
	}

}
