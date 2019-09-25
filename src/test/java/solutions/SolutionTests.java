package solutions;

import com.xxm.solutionhelpers.AbstractSolution;
import com.xxm.solutionhelpers.SolutionFactory;
import com.xxm.solutions.TwoSum;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static junit.framework.TestCase.assertEquals;

public class SolutionTests {

    SolutionFactory factory;

    @Before
    public void setFactory(){
        factory = null;
    }

    @Test
    public void testTwoSumSolution() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String url =  "https://leetcode.com/problems/two-sum/";
        int[] nums = {0,1,10,19,33,40};
        int target = 50;

        factory = new SolutionFactory(url);
        AbstractSolution solution =factory.findSolution();
        int[] res = new int[2];
        if (solution instanceof TwoSum){
            res = ((TwoSum) solution).solve(nums,target);
        }
        assertEquals(2,res[0]);
        assertEquals(5,res[1]);
    }


}


