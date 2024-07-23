package N0103;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionDemoTest {

    @DisplayName("Verificamos que la clase lanza la excepción esperada.")
    @Test
    public void checkArrayIndexOutOfBoundsExceptionDemo(){
        ArrayIndexOutOfBoundsExceptionDemo demo = new ArrayIndexOutOfBoundsExceptionDemo();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> demo.throwArrayIndexOutOfBoundsException());
    }
}
