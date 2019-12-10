package com.main.structures.list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author xiaolin
 * @date 2019/12/10
 **/
public class SkipListTest {
    @Test
    public void test1() {
        SkipList<Integer, String> skipList = new SkipList<>();
        int i = 10000;
        while (i-- > 0) {
            skipList.put(1,i+"");
        }
        skipList.print();
    }
}