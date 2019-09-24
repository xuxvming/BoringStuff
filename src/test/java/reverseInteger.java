public class reverseInteger {

}
class reverseIntegerSolution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0){
            isNegative = true;
            x = Math.abs(x);
        }
        int res = 0;
        while (x>0){
            //checks overflow
            if ((long)res*10 > Integer.MAX_VALUE || (long)res*10 < Integer.MIN_VALUE) {
                return 0;
            }
            res = res*10 + x %10;
            x = x/10;
        }
        if (isNegative){
            return 0-res;
        }
        else{
            return res;
        }
    }
}

