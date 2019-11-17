

// TODO: Auto-generated Javadoc
/**
 * The Class Prova.
 * 
 * @author Andrea Bombarda
 *  
 */
public class Prova {
	
	/**  The first number. */
	int num1;
	
	/**  The second number. */
	int num2;
	
	/** The num 3. */
	int num3;
	
	/**
	 * Instantiates a new prova.
	 */
	public Prova() {
		num1 = 0;
		num2 = 0;
	}
	
	/**
	 * Instantiates a new prova.
	 *
	 * @param n1 the first number
	 * @param n2 the second number
	 */
	public Prova(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	/**
	 * Ritorna la somma dei due numeri .
	 *
	 * @return the int representing the sum of the two numbers
	 */
	public int somma() {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		Prova p = new Prova(2,5);
		System.out.println(p.somma());
	}
	
}
