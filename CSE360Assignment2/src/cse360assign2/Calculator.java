package cse360assign2;
/**
 * 
 * @author Obed Miranda
 * @ASU ID: 1214858593
 * @ID Number = 493
 * @CSE 360 Assignment 2
 * @Description Takes values into account and calculates a total.
 */
public class Calculator {

	/**
	 * total is global variable for the total in the calculator
	 * history is a global variable to hold the history of inputs
	 */
	private int total;
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * getTotal() returns the total amount as an int
	 * @return the total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * add(value) adds a value int to the total.
	 * Records string to history.
	 * @param value is the input integer.
	 */
	public void add (int value) {
		total = total + value;
		history += " + " + value;
	}
	/**
	 * subtract(value) subtracts a value int from the total.
	 * Records string to history.
	 * @param int value input value to subtract from total.
	 */
	public void subtract (int value) {
		total = total - value;
		history += " - " + value;
	}
	/**
	 * multiple(value) multiplies the total by the input.
	 * Records string to history.
	 * @param int value is the input multiplier.
	 */
	public void multiply (int value) {
		total = value * value;
		history += " * " + value;
	}
	/**
	 * divide(value) divides the total by the value input.
	 * Records string to history.
	 * @param int value is the divisor of the total.
	 */
	public void divide (int value) {
		total = (total / value);
		if(value == 0) {
			total = 0;
		}
		history += " / " + value;
	}
	/**
	 * returns the history input
	 * @return string history.
	 */
	public String getHistory ( ) {
		return history;
	}
}
