package org.example.firsttaste.slides.h3;

import org.junit.Test;

public class TypesTest {

    @Test
    public void byteDemo() {
        Types t = new Types();

        t.byteDemo();
    }

    @Test
    public void testOverflow() {
        Types t = new Types();
        t.testOverflowOfBytes();
    }

    @Test
    public void testRefType() {
        Types t = new Types();
        t.testRefType();
    }
}
