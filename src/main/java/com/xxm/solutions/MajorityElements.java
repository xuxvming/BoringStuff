package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.HashMap;

public class MajorityElements extends AbstractSolution {
    public MajorityElements(String questionName, String url) {
        super(questionName, url);
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int num: nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int res = 0;
        for(Integer key : hm.keySet()){
            if (hm.get(key) > nums.length/2){
                res = key;
            }
        }
        return res;
    }


}
