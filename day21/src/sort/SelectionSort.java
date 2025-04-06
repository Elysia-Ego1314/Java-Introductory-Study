package sort;

import java.util.Arrays;

/*
选择排序
每次循环，从无序元素中选出最小元素，放在当前选择的位置
最终实现元素整体有序
 */
public class SelectionSort {
    public void selectionSort(int[] array) {
        for (int i = 0;i<array.length-1;i++) {
            int current = i;
            for (int j = i+1;j<array.length;j++) {
                if (array[j] < array[current]) {
                    current = j;
                }
            }
            int temp = array[i];
            array[i] = array[current];
            array[current] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {18,99,35,17,38,35,36,27};
        selectionSort.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    //选择排序扩展——————双向选择排序
    public void selectionSortOP(int[] array) {
        int low = 0;//无序元素起始位置
        int high = array.length-1;//无序元素终点位置
        //low=high时，证明无序元素只有一个了，故而整体就有序了
        while (low <= high) {
            int max = low;
            int min = low;
            for (int i = low + 1;i<=high;i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
                if (array[i] > array[max]) {
                    max = i;
                }
            }
            int temp = array[low];
            array[low] = array[min];
            array[min] = temp;
            if (max == low) {
                max = min;
            }
            int temp1 = array[high];
            array[high] = array[max];
            array[max] = temp1;
            high--;
            low++;
        }
    }
}
