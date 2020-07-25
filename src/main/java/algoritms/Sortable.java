package algoritms;

import java.util.StringJoiner;

/**
 *
 */
public interface Sortable {

    /**
     * Возвращает отсортированный массив данных
     *
     * @return отсортированный массив данных
     */
    int[] sort();

    /**
     * Перестановка элементов
     * @param i индекс 1 элемента
     * @param j индекс 2 элемента
     */
    default int[] swap(int[] arr, int i, int j) {
        int z = arr[i];
        arr[i] = arr[j];
        arr[j] = z;
        return arr;
    }

    default String toString(int[] arr) {
        StringBuilder builder = new StringBuilder(arr.length);
        for (int i = 0; i < arr.length; i++) {
            builder.append(arr[i]+",");
        }
        return builder.toString();
    }
}
