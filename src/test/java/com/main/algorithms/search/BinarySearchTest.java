package com.main.algorithms.search;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaolin
 * @date 2019/12/10
 **/
@Slf4j
public class BinarySearchTest {

    @Test
    public void binarySearchStandard() {
        int[] arrays = {1, 2, 3, 5, 6, 8, 10, 23, 34, 56, 87};
        System.out.println(arrays.length);
        System.out.println(BinarySearch.binarySearchStandard(arrays, 8));
    }
}