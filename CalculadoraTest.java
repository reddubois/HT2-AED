import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.uvg.main.Calculadora;

class CalculadoraTest {

	final void testEvaluate() {
		Calculadora calc = new Calculadora();
		assertEquals(calc.Evaluate("2 3 +"), 5);
		assertEquals(calc.Evaluate("1 3 5 + +"),9);
		assertEquals(calc.Evaluate("6 1 -"),5);
		assertEquals(calc.Evaluate("6 3 5 10 2 * / * +"),18);
		assertEquals(calc.Evaluate("9 4 3 - *"),9);
	}

}
