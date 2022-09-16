import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
    }
    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 7;
        x.subtract(y);
        Assert.assertEquals(-3, x.numerator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 7;
        x.multiply(y);
        Assert.assertEquals(10, x.numerator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 7;
        x.divide(y);
        Assert.assertEquals(1, x.numerator);
    }

    @Test
    public void testEquals() {
        Rational x = new Rational();
        Rational y = new Rational();
        Rational z = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        y.numerator = 5;
        y.denominator = 7;
        z.numerator = 2;
        z.denominator = 4;
        assertEquals(false, x.equals(z));
        assertEquals(false, y.equals(z));
        assertEquals(false, z.equals(y));
    }

    @Test
    public void testCompareTo() {
        Rational x = new Rational();
        Rational y = new Rational();
        Rational z = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        y.numerator = 5;
        y.denominator = 7;
        z.numerator = 2;
        z.denominator = 4;
        assertEquals(1, x.compareTo(z));
        assertEquals(1, y.compareTo(z));
        assertEquals(-1, z.compareTo(y));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 4;
        String s1 = "1/2";
        assertEquals(s1, x.toString());
    }
}
