package algoritms;

/**
 *  Класс для шейкерной сортировки.
 *  Основан на алгоритме пузырьковой сортировки, но работает в обе стороны.
 */
public class Shaker implements Sortable{

    private int[] arr;

    public Shaker(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int[] sort() {
        int left = 0;
        int right = arr.length - 1;

        System.out.println(this.toString(arr));
        System.out.println();

        while (left <= right) {

//            сортировка с лева на право
            for (int i = 0; i < right; i++) {
                if (arr[i] > arr[i+1]) {
                    arr = swap(arr,i,i+1);
                    System.out.println(this.toString(arr));
                }
            }
            left++;
//            сортировка с права на лево
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i-1]) {
                    arr = swap(arr,i,i-1);
                    System.out.println(this.toString(arr));
                }
            }
            right--;

        }
        System.out.println();
        System.out.println(this.toString(arr));
        return arr;
    }


}
