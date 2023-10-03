import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RomanNumeralConverterTest {

    RomanNumeralConverter numeralConverter = new RomanNumeralConverter();


    @Test
    void expectI() {

        int input = 1;
        String expected = "I";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }


    @Test
    void expectIV() {

        int input = 4;
        String expected = "IV";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectVIII() {

        int input = 8;
        String expected = "VIII";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectIX() {

        int input = 9;
        String expected = "IX";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectX() {

        int input = 10;
        String expected = "X";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectXV() {

        int input = 15;
        String expected = "XV";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectXVI() {

        int input = 16;
        String expected = "XVI";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectXIX() {

        int input = 19;
        String expected = "XIX";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

    @Test
    void expectXX() {

        int input = 20;
        String expected = "XX";
        String result = numeralConverter.converter(input);
        assertEquals(expected, result);
    }

}