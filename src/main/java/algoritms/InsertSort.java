package algoritms;

public class InsertSort implements Sortable{

    private int[] arr;

    public InsertSort(int[] arr) {
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

        for (int i = 1; i < arr.length ; i++) {
            for (int j = i; j>0 ; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j-1,j);
                    System.out.println(this.toString(arr));
                }
            }
        }
        System.out.println(this.toString(arr));
        return arr;
    }
}
