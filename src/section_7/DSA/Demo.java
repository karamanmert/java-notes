package section_7.DSA;

import java.util.LinkedList;

/**
 * @author karamanmert
 * @date 17.12.2024
 */
public class Demo {
    public static void main(String[] args) {
        int nums[] = {5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;

        System.out.println(linearSearch(nums, target));
        // System.out.println(binarySearch(nums, target));

        System.out.println(binarySearch(nums, target, 0, nums.length - 1));

        System.out.println("*****");
        System.out.println("*****");

       int nums2[] = {9,8,7,6,5};
       //for (int i : bubbleSort(nums2)) {
       //    System.out.print(i + " ");
       //}

        System.out.println("*****");
        System.out.println("*****");
        mergeSort(nums2, 0, nums2.length - 1);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("*****");System.out.println("*****");
        LinkedList<Integer> list = new LinkedList<>();

        list.addFirst(5);
        list.add(9);
        list.addLast(7);
        list.add(2,11);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    // o(n^2) nested loops
    private static int[] bubbleSort(int[] nums2) {
        for (int i = 0; i < nums2.length - 1  ; i++) {
            for (int j = 0; j < nums2.length - i - 1; j++) {
                if (nums2[j] > nums2[j + 1]) {
                    int temp = nums2[j];
                    nums2[j] = nums2[j + 1];
                    nums2[j + 1] = temp;
                }
            }
            for (int i2 : nums2) {
                System.out.print(i2 + " ");
            }
            System.out.println();
        }
        return nums2;
    }

    private static void mergeSort(int [] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftIndexSize = mid - left + 1;
        int rightIndexSize = right - mid;

        int [] leftArr = new int[leftIndexSize];
        int [] rightArr = new int[rightIndexSize];

        for (int i = 0; i <leftIndexSize ; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i <rightIndexSize ; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k=0;

        while (i < leftIndexSize && j < rightIndexSize) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftIndexSize)   {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightIndexSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }


    // O(n)
    private static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("steps " + steps);
                return i;
            }
        }
        return -1;
    }

    // O(logn)
    // private static int binarySearch(int[] nums, int target) {
    //     int left = 0, right = nums.length - 1;
    //     int steps = 0;
    //     while (left <= right) {
    //         steps++;
    //         int mid = left + (right - left) / 2;
    //         if (nums[mid] == target) {
    //             System.out.println("steps " + steps);
    //             return mid;
    //         }
    //         if (nums[mid] < target) {
    //             left = mid + 1;
    //         }
    //         if (nums[mid] > target) {
    //             right = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    private static int binarySearch(int[] nums, int target, int left, int right) {

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = binarySearch(nums, target, mid + 1, right);
            else
                right = binarySearch(nums, target, left, mid - 1);
        }
        return -1;
    }
}