package algoritms;

public class SelectionSort implements Sortable {
    private int[] arr;

    public SelectionSort(int[] arr) {
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
        int length = arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            int maxInd = 0;
            for (int j = 1; j < length; j++) {
                if (arr[maxInd] < arr[j]) {
                    maxInd = j;
                }
            }
            if (arr[maxInd] > arr[length]) {
                swap(arr,maxInd,length);
            }
            System.out.println(this.toString(arr));
            length--;
        }
       return arr;
    }
}
