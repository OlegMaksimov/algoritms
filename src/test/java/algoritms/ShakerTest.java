package algoritms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShakerTest {
    int[] arr;
    Shaker shaker;

    @Before
    public void setUp() throws Exception {
        arr = generate(10);
        shaker =  new Shaker(arr);
    }

    @Test
    public void sort() {
        shaker.sort();
    }

    private static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i] = (int) Math.round(Math.random() * 100);
        }
        return arr;
    }
}