package interfaces;

public interface Phone extends Cloneable {
	// Definim metoda ce va fi implementata de clasele aflate in pachetul 'classes'
    Phone makeClone() throws CloneNotSupportedException;
}

