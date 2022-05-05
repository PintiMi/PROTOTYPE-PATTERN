package factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactoryTest {

	@Test
	void test() {
		PhoneFactory test = new PhoneFactory();
		String output = test.toString();
	}

}
