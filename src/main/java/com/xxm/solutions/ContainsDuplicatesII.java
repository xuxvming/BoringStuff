package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesII extends AbstractSolution {
    public ContainsDuplicatesII(String questionName, String url) {
        super(questionName, url);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap();
        for(int i =0; i<nums.length;i++){
            if (hm.containsKey(nums[i])){
                if (Math.abs(i - hm.get(nums[i]))<=k){
                    return true;
                }
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}
