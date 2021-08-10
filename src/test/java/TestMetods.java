import ogr.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMetods {


    @Test
    public void testReturnArray1() {
        Assertions.assertArrayEquals(new int[]{1, 7},
                Main.returnArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void testReturnArray2() {

        Assertions.assertArrayEquals(new int[]{2, 3, 1, 7},
                Main.returnArray(new int[]{1, 2, 4, 2, 3, 1, 7}));
        Assertions.assertArrayEquals(new int[]{},
                Main.returnArray(new int[]{1, 4}));
    }
    @Test
    public void testReturnArrayRuntimeException() {

        Assertions.assertThrows(RuntimeException.class, ()-> Main.returnArray(new int[]{1, 2, 3, 1}));

    }

    @Test
    public void testArr1And4 () {
        Assertions.assertEquals(true, Main.arr1And4(new int[]{1 ,1, 1, 4, 4, 1, 4 ,4 }));
    }

    @Test
    public void testArr1And42 () {
        Assertions.assertEquals(false, Main.arr1And4(new int[]{1, 1, 1, 1, 1, 1}));
        Assertions.assertEquals(false, Main.arr1And4(new int[]{4, 4, 4, 4}));
        Assertions.assertEquals(true, Main.arr1And4(new int[]{1, 4, 4, 1, 1, 4, 3}));
        Assertions.assertEquals(false, Main.arr1And4(new int[]{14, 41, 11, 44}));
        Assertions.assertEquals(false, Main.arr1And4(new int[]{14, 41, 11, 44}));
    }
}



