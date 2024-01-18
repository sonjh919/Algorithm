import java.util.List;
import java.math.BigInteger;
import java.util.ArrayList;

class Solution {
    public List<Integer> solution(int n, int m) {
        List<Integer> res = new ArrayList<>();
        BigInteger a = BigInteger.valueOf(n);
        BigInteger b = BigInteger.valueOf(m);

        BigInteger c = a.gcd(b);
        res.add(c.intValue());
        res.add(((n * m) / c.intValue()));
        return res;
    }
}