package interfaces;

/**
 * 
 * @author Mihaela
 *
 */
public interface Phone extends Cloneable {
	// Definim metoda ce va fi implementata de clasele aflate in pachetul 'companies'
    Phone makeClone() throws CloneNotSupportedException;
}

