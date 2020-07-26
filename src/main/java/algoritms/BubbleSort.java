package algoritms;

public class BubbleSort implements Sortable{

    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    /**
     * Возвращает отсортированный массив данных
     *
     * @return отсортированный массив данных
     */
    @Override
    public int[] sort() {
        System.out.println(this.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < (arr.length -1) - i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr, j, j+1);
                    System.out.println(this.toString(arr));
                }
            }
        }

        return arr;
    }
}
