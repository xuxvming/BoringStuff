package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SingleNumber extends AbstractSolution {
    public SingleNumber(String questionName, String url) {
        super(questionName, url);
    }

    /**
     * every element only appears twice,
     * the sum of all unique elements times 2 minus the sum of all elements is the single number
     * 2(a+b+c+d) - (a+a+b+b+c+d+d) = c*
     * time complexity O(n)
     * space complexity O(n)*/
    public int singleNumber1(int[] nums) {
        HashSet<Integer> hashNums = new HashSet();
        for (int value : nums) {
            hashNums.add(value);
        }
        int sum = 0;
        int sum2= 0;
        for (Integer num: hashNums){
            sum += num.intValue();
        }
        for(int num: nums){
            sum2 += num;
        }
        return (2*sum-sum2);
    }

    /**
     * Bit manipulation
     * using an XOR
     * time complexity O(n)
     * space complexity O(1)*/
    public int singleNumber2(int [] nums){
        int a = 0;
        for (int num:nums){
            a ^= num;
        }
        return a;
    }

    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList();
        for (int num: nums){
            if (list.contains(num)){
                list.remove(num);
            }
            else{
                list.add(num);
            }
        }
        return list.get(0);
    }

}


