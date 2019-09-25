package solutions;

import com.xxm.solutionhelpers.AbstractSolution;
import com.xxm.solutionhelpers.SolutionFactory;
import com.xxm.solutions.TwoSum;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static junit.framework.TestCase.assertTrue;

public class SolutionFactoryTest {

    @Test
    public void testFind() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        String url = "https://leetcode.com/problems/two-sum/";
        SolutionFactory factory = new SolutionFactory(url);
        AbstractSolution solution = factory.findSolution();
        assertTrue(solution instanceof TwoSum);
    }

    @Test
    public void test(){
      TwoSum sum = new TwoSum("name","url");

    }
}
