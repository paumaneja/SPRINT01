package N0102;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DniTest {

    @ParameterizedTest
    @CsvSource (value = {"10759381:G", "99332882:E", "98673109:G", "18318175:D", "48111127:A",
            "86947816:L", "73505705:M", "47049038:P", "95617483:C", "90123456:A"},
            delimiter = ':')

    @DisplayName("Chequeamos que el cálculo de la letra es correcto para una seria de dni")
    public void checkLetterDni (int dni, char expectedLetter){
        char resultLetterDni = Dni.calculateLetterDni(dni);
        Assertions.assertEquals(expectedLetter, resultLetterDni, "Letra incorrecta para el número de DNI: " + dni);
    }

}
