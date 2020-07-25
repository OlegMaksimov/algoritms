import algoritms.InsertSort;
import algoritms.Sortable;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        int size = 10;
        int[] arr = generate(size);
        Sortable sortable = new InsertSort(arr);
        sortable.sort();

    }

    /**
     * Генерация массива случайными числами
     * @param size размер массива
     * @return
     */
    private static int[] generate(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {

           arr[i] = (int) Math.round(Math.random() * 100);
        }
        return arr;
    }
}
