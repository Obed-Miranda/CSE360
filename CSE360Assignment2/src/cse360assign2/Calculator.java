package cse360assign2;

public class Calculator {

	/**
	 * total is global variable for the total in the calculator
	 */
	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * getTotal() returns the total amount as an int
	 * @return
	 */
	public int getTotal () {
		return 0;
	}
	/**
	 * add(value) adds a value int to the total.
	 * @param int value is the input integer.
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * subtract(value) subtracts a value int from the total.
	 * @param int value input value to subtract from total.
	 */
	public void subtract (int value) {
		total = total - value;
	}
	/**
	 * multiple(value) multiplies the total by the input.
	 * @param int value is the input multiplier.
	 */
	public void multiply (int value) {
		total = value * value;
	}
	/**
	 * divide(value) divides the total by the value input.
	 * @param int value is the divisor of the total.
	 */
	public void divide (int value) {
		total = (total / value);
		if(value == 0) {
			total = 0;
		}
	}
	/**
	 * returns the history input
	 * @return string
	 */
	public String getHistory () {
		return "";
	}
}
