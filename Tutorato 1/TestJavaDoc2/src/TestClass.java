
// TODO: Auto-generated Javadoc
/**
 * Classe che si occupa di sommare <b>due</b> numeri.
 */
public class TestClass {

	/** The first number. */
	int a;
	
	/** The second number. */
	int b;
	
	/**
	 * Instantiates a new test class.
	 */
	public TestClass() {
		a = 0;
		b = 0;
	}
	
	/**
	 * Instantiates a new test class.
	 *
	 * @param a the first number
	 * @param b the second number
	 */
	public TestClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Sum numbers.
	 *
	 * @return the int representing the sum of the two numbers
	 */
	public int sumNumbers() {
		return a + b;
	}
	
	public static void main(String[] args) {
		TestClass v1 = new TestClass(5, 6);
		System.out.println(v1.sumNumbers());
	}
	
}
