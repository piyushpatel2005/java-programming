/**
* Calculates compound interest at the end of nth year.
*	a = p(1 + r)^n
*	where, 	p = original amount invested
*			r = annula interest rate in decimal
*			n = number of years
*			a = amount on deposit at the end of nth year.
*/
public class CompoundInterest {
	public static void main ( String[] args ) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;

		System.out.printf( "%s%20s%n", "Year", "Amount on deposit" );

		for ( int year = 1; year <= 10; year++ ) {
			amount = principal * Math.pow(1.0 + rate, year);

			System.out.printf("%4d%,20.2f%n", year, amount );
		}
	}
}