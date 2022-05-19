package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import companies.Apple;
import companies.Samsung;
import interfaces.Phone;

class FactoryTest {

	@Test
	void test() throws CloneNotSupportedException {
		
		/**
		 * creating an Apple product 
		 * test the set and get methods
		 */
		Apple apl = new Apple();
		apl.setColor("red");
		apl.getColor();
		
		/**
		 * creating a Samsung product
		 * test the set and get methods
		 */
		Samsung smsg = new Samsung();
		smsg.setModel("S21");
		smsg.getModel();
		
		/**
		 * creating a clone
		 */
		Phone phoneCopy = apl.makeClone();
		
		
		
	}

}
