import org.example.Calculator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }
    @Test
    fun testAdditionPositiveNumbers() {
        val result = calculator.add(5.0, 3.0)
        assertEquals(8.0, result, "5 + 3 should equal 8")
    }

    @Test
    fun testAdditionNegativeNumbers() {
        val result = calculator.add(-5.0, -3.0)
        assertEquals(-8.0, result, "-5 + -3 should equal -8")
    }

    @Test
    fun testAdditionWithZero() {
        val result = calculator.add(0.0, 7.0)
        assertEquals(7.0, result, "0 + 7 should equal 7")
    }

    @Test
    fun testAdditionEdgeCaseLargeNumbers() {
        val result = calculator.add(Double.MAX_VALUE, Double.MAX_VALUE)
        assertTrue(result.isInfinite(), "Adding Double.MAX_VALUE + Double.MAX_VALUE should result in Infinity")
    }

    @Test
    fun testSubtractionPositiveNumbers() {
        val result = calculator.subtract(10.0, 4.0)
        assertEquals(6.0, result)
    }

    @Test
    fun testSubtractionWithZero() {
        val result = calculator.subtract(5.0, 0.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testMultiplicationPositiveNumbers() {
        val result = calculator.multiply(2.0, 3.0)
        assertEquals(6.0, result)
    }

    @Test
    fun testMultiplicationWithZero() {
        val result = calculator.multiply(5.0, 0.0)
        assertEquals(0.0, result)
    }

    @Test
    fun testMultiplicationNegativeNumbers() {
        val result = calculator.multiply(-2.0, 3.0)
        assertEquals(-6.0, result)
    }

    @Test
    fun testDivisionPositiveNumbers() {
        val result = calculator.divide(10.0, 2.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testDivisionNegativeNumbers() {
        val result = calculator.divide(-10.0, 2.0)
        assertEquals(-5.0, result)
    }

    @Test
    fun testDivisionByZero() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10.0, 0.0)
        }
    }

    @Test
    fun testDivisionEdgeCaseSmallNumbers() {
        val result = calculator.divide(1.0, Double.MIN_VALUE)
        assertTrue(result.isInfinite() || result > 1e307)
    }

}

