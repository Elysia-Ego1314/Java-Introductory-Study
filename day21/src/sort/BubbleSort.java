package sort;

import java.util.Arrays;
/*
冒泡循环
在无序的元素中，通过相邻元素在比较
每次将最大元素冒泡到最后，最终实现元素整体有序
 */
public class BubbleSort {
    public void bubbleSort(int[] array) {
        for (int i = 0;i<array.length-1;i++) {
            for (int j = 0;j<array.length-1-i;j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {18,99,35,17,38,35,36,27};
        bubbleSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
