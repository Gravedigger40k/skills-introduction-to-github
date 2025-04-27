import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testSumyDwochLiczbDodatnich() {
        assertThat(Calculator.add_numbers(3, 10)).isEqualTo(13);
    }

    @Test
    public void testSumyDwochLiczbDodatniaIUjemna(){
        assertThat(Calculator.add_numbers(9, -5)) .isEqualTo(4);
    }
    @Test
    public void testSumyDwochLiczbUjemnch(){
        assertThat(Calculator.add_numbers(-9, -5)) .isEqualTo(-14);
    }
    @Test
    public void testSumyDwochLiczbGdyJednaJestZero(){
        assertThat(Calculator.add_numbers(9, 0)) .isEqualTo(9);
        assertThat(Calculator.add_numbers(0, -5)) .isEqualTo(-5);
        assertThat(Calculator.add_numbers(0, 0)) .isEqualTo(0);
    }

    @Test
    public void testLiczbyParzyste() {
        assertThat(Calculator.is_even(4)).isTrue();
    }

    @Test
    public void testLiczbyNieparzyste() {
        assertThat(Calculator.is_even(3)).isFalse();
    }

    @Test
    public void testZero() {
        assertThat(Calculator.is_even(0)).isTrue();
    }

    @Test
    public void testDuzaLiczba() {
        assertThat(Calculator.is_even(1_000_000)).isTrue();
        assertThat(Calculator.is_even(1_000_001)).isFalse();
    }

    @Test
    public void testTemperaturyStandardowe() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
        assertThat(Calculator.celsius_to_fahrenheit(100)).isEqualTo(212.0);
    }

    @Test
    public void testTemperaturyUjemne() {
        assertThat(Calculator.celsius_to_fahrenheit(-10)).isEqualTo(14.0);
    }

    @Test
    public void testTemperaturyDuze() {
        assertThat(Calculator.celsius_to_fahrenheit(1000)).isEqualTo(1832.0);
    }

    @Test
    public void testTemperaturaZero() {
        assertThat(Calculator.celsius_to_fahrenheit(0)).isEqualTo(32.0);
    }

    @Test
    public void testSilniaMalychLiczb() {
        assertThat(Calculator.factorial(0)).isEqualTo(1);
        assertThat(Calculator.factorial(1)).isEqualTo(1);
        assertThat(Calculator.factorial(2)).isEqualTo(2);
    }

    @Test
    public void testSilniaDuzeLiczby() {
        assertThat(Calculator.factorial(5)).isEqualTo(120);
        assertThat(Calculator.factorial(10)).isEqualTo(3628800);
    }

    @Test
    public void testSilniaUjemnaLiczba() {
        assertThatThrownBy(() -> Calculator.factorial(-3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Liczba musi być nieujemna");
    }

    @Test
    public void testSilniaWydajnosciowo() {
        assertThat(Calculator.factorial(20)).isEqualTo(2432902008176640000L);
    }

    @Test
    public void testLiczbyPierwsze() {
        assertThat(Calculator.is_prime(2)).isTrue();
        assertThat(Calculator.is_prime(3)).isTrue();
        assertThat(Calculator.is_prime(5)).isTrue();
        assertThat(Calculator.is_prime(7)).isTrue();
    }

    @Test
    public void testLiczbyNiepierwsze() {
        assertThat(Calculator.is_prime(4)).isFalse();
        assertThat(Calculator.is_prime(6)).isFalse();
        assertThat(Calculator.is_prime(8)).isFalse();
        assertThat(Calculator.is_prime(9)).isFalse();
    }

    @Test
    public void testLiczbyMniejszeNizDwa() {
        assertThat(Calculator.is_prime(-1)).isFalse();
        assertThat(Calculator.is_prime(0)).isFalse();
        assertThat(Calculator.is_prime(1)).isFalse();
    }

    @Test
    public void testDuzeLiczbyPierwsze() {
        assertThat(Calculator.is_prime(7919)).isTrue();
    }
}
