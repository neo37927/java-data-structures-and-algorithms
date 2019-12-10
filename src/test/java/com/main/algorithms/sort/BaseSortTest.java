package com.main.algorithms.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaolin
 * @date 2019/12/10
 **/
@Slf4j
public class BaseSortTest {

    @Test
    public void bubbleSort() {
        int[] arrays = {11, 23, 2, 56, 5, 46, 8, 10, 7, 34, 4, 87};
        BaseSort baseSort = new BaseSort();
        baseSort.bubbleSort(arrays);
        log.info(JSON.toJSONString(arrays));
    }

    @Test
    public void fastSort() {
        int[] arrays = {11, 23, 2, 56, 5, 46, 8, 10, 7, 34, 4, 87};
        BaseSort baseSort = new BaseSort();
        baseSort.fastSort(arrays, 0, arrays.length-1);
        log.info(JSON.toJSONString(arrays));
    }

    @Test
    public void insertSort() {
        int[] arrays = {11, 23, 2, 56, 5, 46, 8, 10, 7, 34, 4, 1};
        log.info(JSON.toJSONString(arrays));
        BaseSort baseSort = new BaseSort();
        baseSort.insertSort(arrays);
        log.info(JSON.toJSONString(arrays));
    }

    @Test
    public void shellSort() {
        int[] arrays = {11, 23, 2, 56, 5, 46, 8, 10, 7, 34, 4, 1};
        log.info(JSON.toJSONString(arrays));
        BaseSort baseSort = new BaseSort();
        baseSort.shellSort(arrays);
        log.info(JSON.toJSONString(arrays));
    }
}