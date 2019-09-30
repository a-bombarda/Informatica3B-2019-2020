// TODO: Auto-generated Javadoc
/**
 * Classe che si occupa di sommare due numeri passati per argomento al costruttore.
 *
 * @author Andrea Bombarda
 */
public class TestJavaDoc {
	
	/** Primo numero. */
	private static int a;
	
	/** Secondo numero. */
	private static int b;
	
	/**
	 * Costruttore di default. Inizializza a 0 entrambi i numeri
	 */
	public TestJavaDoc() {
		a = 0;
		b = 0;
	}
	
	/**
	 * Costruttore generico che riceve i due valori dei numeri da sommare	.
	 *
	 * @param a primo numero
	 * @param b secondo numero
	 */
	public TestJavaDoc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Ritorna la somma dei due numeri.
	 *
	 * @return the int representing the sum of the two numbers
	 */
	public static int sumNumbers() {
		return a + b;
	}
	
}
