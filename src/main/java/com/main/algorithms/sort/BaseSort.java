package com.main.algorithms.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author xiaolin
 * @date 2019/12/10
 **/
@Slf4j
public class BaseSort {

    /**
     * 冒泡排序
     *
     * @param arr 数组
     */
    void bubbleSort(int[] arr) {
        int i, j, temp, timer = 0;
        int len = arr.length;
        for (j = 0; j < len - 1; j++) {
            for (i = 0; i < len - 1 - j; i++) {
                log.info("bubble times = {} ", ++timer);
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        log.info("bubble arraySize = {} times = {}", arr.length, timer);
    }

    /**
     * 快排序
     *
     * @param arr  数组
     * @param low  排序范围低位
     * @param high 排序范围高位
     */
    void fastSort(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        //缓存基准值
        int pivot = arr[low];

        //范围区间，基于基准值归类（高值、低值）
        while (l < h) {
            //高位指针 向低位靠近
            while (l < h && arr[h] >= pivot) {
                h--;
            }

            //匹配到 高位值小于基准值
            if (l < h) {
                arr[l] = arr[h];
                l++;
            }

            //低位指针 向高位靠近
            while (l < h && arr[l] <= pivot) {
                l++;
            }

            //匹配到 低位值大于基准值
            if (l < h) {
                arr[h] = arr[l];
                h--;
            }
        }

        //基准值赋值
        arr[l] = pivot;

        log.info("fastSort low = {} ; high = {} ; pivot = {} ", low + 1, high + 1, pivot);
//        log.info("fastSort l = {} ; h = {} ; pivot = {} ", l + 1, h + 1, pivot);
        log.info("fastSort array = {}", JSON.toJSONString(arr));

        if (l - 1 > low) {
            fastSort(arr, low, l - 1);
        }
        if (h + 1 < high) {
            fastSort(arr, h + 1, high);
        }
    }


    /**
     * 插队排序
     *
     * @param arr
     */
    void insertSort(int[] arr) {
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            //默认跳过 数组当前位移排序有效（只有一个元素）

            //缓存数组位i的值，也就是相对子数组的末尾值
            int temp = arr[i];

            //遍历数组，i-1前是否存在较大值，将大值后移
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            //未发生替换，直接返回
            if (j + 1 == i) {
                continue;
            }
            arr[j + 1] = temp;
            log.info(JSON.toJSONString(arr));
        }
    }


    /**
     * 希尔排序
     *
     * @param arr
     */
    void shellSort(int[] arr) {
        int len = arr.length;
        int step = len / 2;
        int temp;

        while (step > 0) {
            for (int i = step; i < len; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
            log.info("shellSort step = {} arr = {}", step, JSON.toJSONString(arr));
            //核心逻辑 修改步进
            step /= 2;
        }
    }
}
