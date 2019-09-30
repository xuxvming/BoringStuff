package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

public class MoveZeros extends AbstractSolution {
    public MoveZeros(String questionName, String url) {
        super(questionName, url);
    }

    /***/
    public void moveZeroes(int[] nums) {
        int key = 0;
        for (int i = 0; i <nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums [i] = nums[key];
                nums[key] = temp;
                key++;
            }

        }
    }
}
