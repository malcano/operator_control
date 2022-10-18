import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Parity {

    public static short getParity(int x) {
        // your code here
        int count=0;

        if(x<0) // if x is negative
            x=~x; // let x be logical not (two's complement)

        while(x!=0)
        {
            if(x%2==0) {
                x=x/2;
                continue;
            }
            x=x/2;
            count++; //if there's an 1, add count
        }
        if(count%2==0)// When the number of 1 is even, parity bit would be 0
            return 0;

        else
            return 1;
    }

    @Test
    public void test() {
        // assertEquals(expected, actual)
        assertEquals(1, Parity.getParity(42));
        assertEquals(0, Parity.getParity(10));
        assertEquals(0, Parity.getParity(-100));
        assertEquals(1, Parity.getParity(-50));
        assertEquals(0, Parity.getParity(12345));
        assertEquals(1, Parity.getParity(85318817));
    }
}
