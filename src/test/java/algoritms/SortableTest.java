package algoritms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortableTest {
    int[] arr;

    @Before
    public void setUp() throws Exception {
        arr = generate(2);
    }

    @Test
    public void swap() {
        Shaker shaker = new Shaker(arr);
        System.out.println(shaker.toString(arr));
        shaker.swap(arr, 0, 1);
        System.out.println(shaker.toString(arr));
    }

    private static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i] = (int) Math.round(Math.random() * 100);
        }
        return arr;
    }
}