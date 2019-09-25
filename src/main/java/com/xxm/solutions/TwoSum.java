package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import java.util.HashMap;

public class TwoSum extends AbstractSolution {

    public TwoSum(String questionName, String url) {
        super(questionName, url);
    }

    public int[] solve(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap();
        for(int i = 0; i<nums.length;i++){
            if(hm.containsKey(target - nums[i])){
                return new int[]{hm.get(target-nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{0};
    }
}
