package com.main.algorithms.search;


import lombok.extern.slf4j.Slf4j;

/**
 * @author xiaolin
 * @date 2019/12/10
 **/
@Slf4j
public class BinarySearch {
    /**
     * 二分查找
     * <p>
     * 如果是start < end，那么当target等于num[num.length-1]时，会找不到该值。
     * <p>
     * 因为num[mid] > target,
     * 所以如果有num[index] == target, index一定小于mid，能不能写成end = mid呢？
     * 举例来说：num = {1, 2, 5, 7, 9}; 如果写成end = mid，当循环到start = 0, end = 0时（即num[start] = 1, num[end] = 1时），mid将永远等于0，此时end也将永远等于0，陷入死循环。也就是说寻找target = -2时，程序将死循环。
     * <p>
     * 因为num[mid] < target, 所以如果有num[index] == target, index一定大于mid，能不能写成start = mid呢？
     * 举例来说：num = {1, 2, 5, 7, 9}; 如果写成start = mid，当循环到start = 3, end = 4时（即num[start] = 7, num[end] = 9时），mid将永远等于3，此时start也将永远等于3，陷入死循环。也就是说寻找target = 9时，程序将死循环。
     *
     * @param num
     * @param target
     * @return
     */
    public static int binarySearchStandard(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;
        int timer = 0;
        //注意1
        while (start <= end) {
            log.info("Times = {} start = {} end = {}", ++timer, start, end);
            int mid = start + ((end - start) >> 1);
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                //注意2
                end = mid - 1;
            } else {
                //注意3
                start = mid + 1;
            }
        }
        return -1;
    }

}
