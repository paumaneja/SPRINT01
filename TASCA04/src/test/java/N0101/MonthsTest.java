package N0101;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MonthsTest {

    private static ArrayList<String> listMonths;

    @BeforeAll
    static void init() {
        Months months = new Months();
        listMonths = months.addMonths();
    }

    @DisplayName("Verificamos que la lista tiene 12 posiciones.")
    @Test
    void checkSizeMonths() {
        Assertions.assertEquals(12, listMonths.size(), "La lista no tiene 12 posiciones.");
    }

    @DisplayName("Verificamos que la lista no es nula.")
    @Test
    void checkNullMonths() {
        Assertions.assertNotNull(listMonths, "La lista es nula");
    }

    @DisplayName("Verificamos que en la posición 8 contiene Agosto")
    @Test
    void checkPositionEight() {
        Assertions.assertEquals("Agosto", listMonths.get(7), "En la posición 8 no está Agosto.");
    }
}
